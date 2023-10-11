package classwork.task005;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

class UserServiceTest {
    @Test
    void testRegisterUser() {
// Создаем шпиона для EmailService
        EmailService emailService = spy(new EmailService());

// Создаем объект UserService с шпионом EmailService
        UserService userService = new UserService(emailService);

// Вызываем метод registerUser
        userService.registerUser("user@example.com");

// Проверяем, что метод sendEmail был вызван с определенными аргументами
        verify(emailService).sendEmail("user@example.com", "Добро пожаловать!", "Добро пожаловать в наше приложение!");

// Проверяем, что метод sendEmail был вызван один раз
        verify(emailService, times(1)).sendEmail(Mockito.anyString(), Mockito.anyString(), Mockito.anyString());

// Можно также проверить, сколько раз был вызван другой метод EmailService, если он есть
// verify(emailService, times(1)).anotherMethod(Mockito.any());

    }
}