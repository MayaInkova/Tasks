package projects;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WeatherService weatherService = new WeatherService();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the city: ");
        String city = scanner.nextLine();

        Weather weather = weatherService.getWeather(city);
        System.out.println(weather);
    }
}
