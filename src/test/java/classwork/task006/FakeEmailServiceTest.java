package classwork.task006;


import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FakeEmailServiceTest {
    @Test
    void testRegisterUserWithFakeEmailService() {
// Создаем подделку (фейк) EmailService
        FakeEmailService fakeEmailService = new FakeEmailService();

// Создаем объект UserService с фейком EmailService
        UserService userService = new UserService(fakeEmailService);

// Вызываем метод registerUser
        userService.registerUser("user@example.com");

// Получаем список отправленных сообщений из фейка
        List<EmailMessage> sentMessages = fakeEmailService.getSentMessages();

// Проверяем, что было отправлено одно сообщение
        assertEquals(1, sentMessages.size());

// Проверяем, что отправленное сообщение содержит ожидаемые данные
        EmailMessage emailMessage = sentMessages.get(0);
        assertEquals("user@example.com", emailMessage.getTo());
        assertEquals("Добро пожаловать!", emailMessage.getSubject());
        assertEquals("Добро пожаловать в наше приложение!", emailMessage.getBody());
    }
}