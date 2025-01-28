package com.example;
import java.util.Scanner; 

public class App 
{
    public static void main( String[] args ) {

        Dadosclimaticos dc = new Dadosclimaticos();

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome da cidade: ");
        String cidade = sc.nextLine();
        sc.close();

        try {
            String dadosClimaticos = dc.getDadosClimaticos(cidade); // Método na qual irar retornar em formato de json todos os dados da cidade que passei acima

            // codigo 1006 na apiWeather siginifica localização não é encontrada

            if (dadosClimaticos.contains("\"code\":1006")) { // formato de erro que retorna dentro do json

                System.out.println("Localização não encontrada, Digite novamente o local desejado!");

            } else {
                dc.imprimirDadosClimaticos(dadosClimaticos);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}