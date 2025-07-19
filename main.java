import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {
        String apiKey = "your_api_key"; // Replace with your WeatherAPI.com key
        String city = "London";
        String urlString = "http://api.weatherapi.com/v1/current.json?key=" + apiKey + "&q=" + city;

        try {
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(
                new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuffer content = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }

            in.close();
            conn.disconnect();

            JSONObject obj = new JSONObject(content.toString());
            String location = obj.getJSONObject("location").getString("name");
            String country = obj.getJSONObject("location").getString("country");
            double tempC = obj.getJSONObject("current").getDouble("temp_c");
            String condition = obj.getJSONObject("current").getJSONObject("condition").getString("text");

            System.out.println("Weather Information:");
            System.out.println("City: " + location);
            System.out.println("Country: " + country);
            System.out.println("Temperature (C): " + tempC);
            System.out.println("Condition: " + condition);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
