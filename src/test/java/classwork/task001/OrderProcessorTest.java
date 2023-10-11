package classwork.task001;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class OrderProcessorTest {

    @Test
    void testProcessOrderWithDummy() {
// ������� ��������� ������ Customer
        Customer dummyCustomer = mock(Customer.class);

// ������� ��������� OrderProcessor
        OrderProcessor orderProcessor = new OrderProcessor();

// �������� ����� processOrder � ��������� �������� Customer
        orderProcessor.processOrder(dummyCustomer);

// ���������, ��� � ��������� �������� Customer �� ���� ��������������
        verifyNoMoreInteractions(dummyCustomer);
    }
}