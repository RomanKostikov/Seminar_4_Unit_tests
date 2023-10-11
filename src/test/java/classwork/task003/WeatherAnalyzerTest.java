package classwork.task003;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WeatherAnalyzerTest {
    @Test
    void testIsSunnyTodayWithStub() {
// ������� �������� ��� WeatherService
        WeatherService weatherService = mock(WeatherService.class);

// ������������� ������� ����� ��� ������ getCurrentWeather
        when(weatherService.getCurrentWeather("������")).thenReturn("��������");

// ������� ��������� WeatherAnalyzer � ���������
        WeatherAnalyzer weatherAnalyzer = new WeatherAnalyzer(weatherService);

// ���������, ��� ����� isSunnyToday ���������� true ��� "������"
        assertTrue(weatherAnalyzer.isSunnyToday("������"));
    }
}