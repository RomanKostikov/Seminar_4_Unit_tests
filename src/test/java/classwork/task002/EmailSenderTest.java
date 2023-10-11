package classwork.task002;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class EmailSenderTest {
    @Test
    void testSendEmailWithDummy() {
// Создаем фиктивный объект Email
        Email dummyEmail = mock(Email.class);

// Создаем экземпляр EmailSender
        EmailSender emailSender = new EmailSender();

// Вызываем метод sendEmail с фиктивным объектом Email
        emailSender.sendEmail(dummyEmail);

// Проверяем, что с фиктивным объектом Email не было взаимодействий
        verifyNoMoreInteractions(dummyEmail);
    }
}