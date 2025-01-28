package com.example;

import org.json.JSONObject;

import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;


    // MÉTODO PARA PEGAR DADOS CLIMATICOS

public class Dadosclimaticos extends App {

    public static String getDadosClimaticos(String cidade) throws Exception {

        String apiKey = Files.readString(Paths.get("api-key.txt")).trim();

        String formataNomeCidade = URLEncoder.encode(cidade, StandardCharsets.UTF_8);
        String apiUrl = "http://api.weatherapi.com/v1/current.json?key=" + apiKey + "&q=" + formataNomeCidade;

        HttpRequest request = HttpRequest.newBuilder() // começa a construção de uma nova solicitação http
                        .uri(URI.create(apiUrl)) // Método que define a URI da solicitação HTTP
                        .build(); // Finaliza a construção da solicitação HTTP


        // Criando um objeto que envia solicitações http e recebe respostas HTTP, Para acessar o site da weatherAPI

        HttpClient client = HttpClient.newHttpClient();

        // Enviando requisições HTTP e receber respostas HTTP , comunicando com o site.
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        //Retornando dados obtidos no site API Weather
        return response.body();
    }


    // MÉTODO PARA IMPRIMIR DADOS CLIMÁTICOS DE FORMA ORGANIZADA

    public static void imprimirDadosClimaticos(String dados){

        JSONObject dadosJson = new JSONObject(dados);
        JSONObject informacoesMeterologicas = dadosJson.getJSONObject("current");

        // Extrai os dados da localização 

        String cidade = dadosJson.getJSONObject("location").getString("name");
        String pais = dadosJson.getJSONObject("location").getString("country");

        // Extrai os dados adicionais

        String condicaoTempo = informacoesMeterologicas.getJSONObject("condition").getString("text");
        int umidade = informacoesMeterologicas.getInt("humidity");
        float velocidadeVento = informacoesMeterologicas.getFloat("wind_kph");
        float pressaoAtmosferica = informacoesMeterologicas.getFloat("pressure_mb");
        float sensacaoTermica = informacoesMeterologicas.getFloat("feelslike_c");
        float temperaturaAtual = informacoesMeterologicas.getFloat("temp_c");

        // Extrair a data e hora da string retornada da API

        String dataHoraString = informacoesMeterologicas.getString("last_updated");

        // imprimir informações atuais

        System.out.println("informações metrologicas para " + cidade + ", " + pais);
        System.out.println("Data e Hora: " + dataHoraString);
        System.out.println("Temperatura atual: " + temperaturaAtual + "°C");
        System.out.println("Sensação Térmica: " + sensacaoTermica + "°C");
        System.out.println("Condição do Tempo: " + condicaoTempo);
        System.out.println("Umidade: " + umidade + "%");
        System.out.println("Velocidade do Vento: " + velocidadeVento + " km/h");
        System.out.println("Pressão Atmosferica: " + pressaoAtmosferica + " mb" );

    }

}


