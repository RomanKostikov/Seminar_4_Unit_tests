package classwork.task007;

public class FakeCalculator extends Calculator {
    @Override
    public int add(int a, int b) {
        return 42; // ���������� ������������� �������� ��� add
    }

    @Override
    public int subtract(int a, int b) {
        return -1; // ���������� ������������� �������� ��� subtract
    }

    @Override
    public int multiply(int a, int b) {
        return 10; // ���������� ������������� �������� ��� multiply
    }

    @Override
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return 5; // ���������� ������������� �������� ��� divide
    }
}
