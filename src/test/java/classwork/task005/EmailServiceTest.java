package classwork.task005;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

public class EmailServiceTest {

    @Test
    void testSendWelcomeEmail() {
// ������� ������ ��� ������� �������� email
        EmailService emailService = spy(new EmailService());

// �������� ����� ����������� ������������
        UserService userService = new UserService(emailService);
        userService.registerUser("user@example.com");

// ���������, ��� ����� sendEmail ��� ������ � ������������� �����������
        verify(emailService).sendEmail("user@example.com", "����� ����������!", "����� ���������� � ���� ����������!");
    }
}