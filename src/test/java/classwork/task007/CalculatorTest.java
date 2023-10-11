package classwork.task007;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    void testCalculatorWithFake() {
// ������� �������� �����������
        Calculator fakeCalculator = new FakeCalculator();

// ��������� �������� � �������������� ��������� ������������
        int resultAdd = fakeCalculator.add(2, 3);
        int resultSubtract = fakeCalculator.subtract(5, 2);
        int resultMultiply = fakeCalculator.multiply(3, 4);
        int resultDivide = fakeCalculator.divide(10, 2);

// ���������, ��� ���������� ������������� ��������� ������������� ���������
        assertEquals(42, resultAdd);
        assertEquals(-1, resultSubtract);
        assertEquals(10, resultMultiply);
        assertEquals(5, resultDivide);
    }
}