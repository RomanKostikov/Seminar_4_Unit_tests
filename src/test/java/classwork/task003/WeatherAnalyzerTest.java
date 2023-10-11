package classwork.task003;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WeatherAnalyzerTest {
    @Test
    void testIsSunnyTodayWithStub() {
// Создаем заглушку для WeatherService
        WeatherService weatherService = mock(WeatherService.class);

// Устанавливаем жесткий ответ для метода getCurrentWeather
        when(weatherService.getCurrentWeather("Москва")).thenReturn("Солнечно");

// Создаем экземпляр WeatherAnalyzer с заглушкой
        WeatherAnalyzer weatherAnalyzer = new WeatherAnalyzer(weatherService);

// Проверяем, что метод isSunnyToday возвращает true для "Москва"
        assertTrue(weatherAnalyzer.isSunnyToday("Москва"));
    }
}