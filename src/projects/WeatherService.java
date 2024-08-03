package projects;

import java.util.Random;

public class WeatherService {
    private static final String[] CONDITIONS = {"Sunny", "Cloudy", "Rainy", "Windy", "Snowy"};

    public Weather getWeather(String city) {
        Random random = new Random();
        double temperature = -10 + (40 * random.nextDouble()); // Температура от -10°C до 30°C
        int humidity = random.nextInt(101); // Влажност от 0% до 100%
        String condition = CONDITIONS[random.nextInt(CONDITIONS.length)];
        return new Weather(city, temperature, humidity, condition);
    }
}

