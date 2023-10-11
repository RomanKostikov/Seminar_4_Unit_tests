package classwork.task007;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    void testCalculatorWithFake() {
// Создаем фейковый калькулятор
        Calculator fakeCalculator = new FakeCalculator();

// Выполняем операции с использованием фейкового калькулятора
        int resultAdd = fakeCalculator.add(2, 3);
        int resultSubtract = fakeCalculator.subtract(5, 2);
        int resultMultiply = fakeCalculator.multiply(3, 4);
        int resultDivide = fakeCalculator.divide(10, 2);

// Проверяем, что результаты соответствуют ожидаемым фиксированным значениям
        assertEquals(42, resultAdd);
        assertEquals(-1, resultSubtract);
        assertEquals(10, resultMultiply);
        assertEquals(5, resultDivide);
    }
}