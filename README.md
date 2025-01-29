# Real-Time Weather Information System 🌦️  

A real-time weather information system developed in **Java** as a learning project, integrating with the [WeatherAPI](https://www.weatherapi.com/).  

## 📌 About the Project  

This project was created to improve my skills in **Java** and working with **APIs**. It uses **WeatherAPI** to fetch real-time weather data and display detailed information in an accessible and organized way.  

## 🚀 Features  

✔ Retrieve real-time weather information for a specific city or location.  
✔ Display data such as **temperature, current conditions, humidity, wind speed, and more**.  
✔ Uses **HTTP requests** to communicate with the API.  
✔ **Modular and easy-to-maintain** code structure.  

## 🛠 Installation & Usage  

Follow the steps below to set up and run the project:  

### Prerequisites  

- Java Development Kit (JDK) 11 or above.
- Apache Maven installed.  
- Internet connection for API requests.  
- A valid API key from [WeatherAPI](https://www.weatherapi.com/).  

### Steps  

1. Clone the repository:  
   ```sh
   git clone https://github.com/Joserem/CLIMATE-INFORMATION-SYSTEM-WITH-WeatherAPI.git
   
2. Navigate to the project folder:
   ```sh
   cd your-repository
   
3. Add your WeatherAPI key:
- Create a file named api-key.txt in the root directory.
- Paste your API key inside the file.
  
4. Build the project using Maven:
   ```sh
   mvn clean install

5. Run the application:
   ```sh
   java -cp target/meu-projeto-json-1.0-SNAPSHOT.jar com.example.App
   
6. Enter the name of the desired city when prompted, and view the weather information.

## 💡 Why ?  

This project was developed as a personal initiative to deepen my knowledge in **Java** and API integration. Additionally, it serves as a practical example of how to build a system that consumes and processes data from external services.  

## 📷 Example Output
Below is an example of the application output:
```yaml
Digite o nome da cidade: Sao Luis
informações metrológicas para Sao Luis, Brazil
Data e Hora: 2025-01-28 23:00
Temperatura atual: 27.1°C
Sensação Térmica: 31.3°C
Condição do Tempo: Clear
Umidade: 89%
Velocidade do Vento: 22.0 km/h
Pressão Atmosferica: 1011.0 mb
```

## ⚠ Notes  

- **WeatherAPI** requires an access key. Make sure to set up your own API key in the code before using the system. You can get a free key from the official website: [WeatherAPI](https://www.weatherapi.com/).  
- The system can be **adapted** for other purposes or expanded with additional features.

---

📌 *Feel free to contribute, suggest improvements, or report issues!* 🚀 




