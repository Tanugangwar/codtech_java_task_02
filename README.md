🚀 CODTECH Internship Task-2: REST API Client



🎯 Objective:
Build a Java application that connects to a public RESTful API—such as WeatherAPI—to fetch and display real-time weather information in a clean, structured format using Java’s built-in networking tools and JSON parsing libraries.

✨ Key Features:
✅ HTTP Communication: Uses HttpURLConnection to send GET requests to the API.
✅ Dynamic JSON Parsing: Extracts city, country, temperature, and weather condition using org.json.
✅ Real-Time Weather Info: Displays accurate and up-to-date weather data.
✅ Error Handling: Gracefully handles unexpected API responses or connection issues.
✅ Modular & Maintainable: Easily extensible for other REST APIs or data types.

🔧 How to Set Up & Run the Project
🖥️ No frameworks required — just pure Java and one external JAR.

1. 🧬 Clone the Repository
git clone https://github.com/yourusername/RESTApiClient.git
cd RESTApiClient

2. 📥 Download JSON Library
Download the latest version of org.json library: Download from Maven

Place the JAR file in the project folder (e.g., libs/json.jar)

3. 🔑 Get Weather API Key
Register at https://www.weatherapi.com

Replace the placeholder your_api_key in Main.java with your actual API key.

4. ⚙️ Compile the Program
javac -cp ".;libs/json.jar" src/Main.java

5. ▶️ Run the Application
java -cp ".;libs/json.jar;src" Main

📌 Note: Use : instead of ; on macOS/Linux for classpath separation.
