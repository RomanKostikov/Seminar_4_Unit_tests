package classwork.task003;

public class WeatherAnalyzer {
    private WeatherService weatherService;

    public WeatherAnalyzer(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    public boolean isSunnyToday(String location) {
        String currentWeather = weatherService.getCurrentWeather(location);
        return currentWeather.equals("Солнечно");
    }
}
