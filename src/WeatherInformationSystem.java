import java.util.Scanner;

public class WeatherInformationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String location = "";
        int choice = 0;
        
        while (choice != 6) {
            System.out.println("Weather Information System");
            System.out.println("1. Current weather conditions");
            System.out.println("2. Hourly and daily forecasts");
            System.out.println("3. Radar and satellite imagery");
            System.out.println("4. Severe weather alerts");
            System.out.println("5. Historical weather data");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter location: ");
                    location = scanner.next();
                    displayCurrentWeather(location);
                    break;
                case 2:
                    System.out.print("Enter location: ");
                    location = scanner.next();
                    displayHourlyAndDailyForecasts(location);
                    break;
                case 3:
                    System.out.print("Enter location: ");
                    location = scanner.next();
                    displayRadarAndSatelliteImagery(location);
                    break;
                case 4:
                    System.out.print("Enter location: ");
                    location = scanner.next();
                    displaySevereWeatherAlerts(location);
                    break;
                case 5:
                    System.out.print("Enter location: ");
                    location = scanner.next();
                    displayHistoricalWeatherData(location);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        
        scanner.close();
    }
    
    public static void displayCurrentWeather(String location) {
        // code to fetch and display current weather conditions for the given location
        System.out.println("Current weather conditions for " + location + ":");
        // display temperature, humidity, wind speed and direction, etc.
    }
    
    public static void displayHourlyAndDailyForecasts(String location) {
        // code to fetch and display hourly and daily forecasts for the given location
        System.out.println("Hourly and daily forecasts for " + location + ":");
        // display forecast data
    }
    
    public static void displayRadarAndSatelliteImagery(String location) {
        // code to fetch and display radar and satellite imagery for the given location
        System.out.println("Radar and satellite imagery for " + location + ":");
        // display imagery
    }
    
    public static void displaySevereWeatherAlerts(String location) {
        // code to fetch and display severe weather alerts for the given location
        System.out.println("Severe weather alerts for " + location + ":");
        // display alerts
    }
    
    public static void displayHistoricalWeatherData(String location) {
        // code to fetch and display historical weather data for the given location
        System.out.println("Historical weather data for " + location + ":");
        // display historical data
    }
}