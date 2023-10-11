package classwork.task005;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

class UserServiceTest {
    @Test
    void testRegisterUser() {
// ������� ������ ��� EmailService
        EmailService emailService = spy(new EmailService());

// ������� ������ UserService � ������� EmailService
        UserService userService = new UserService(emailService);

// �������� ����� registerUser
        userService.registerUser("user@example.com");

// ���������, ��� ����� sendEmail ��� ������ � ������������� �����������
        verify(emailService).sendEmail("user@example.com", "����� ����������!", "����� ���������� � ���� ����������!");

// ���������, ��� ����� sendEmail ��� ������ ���� ���
        verify(emailService, times(1)).sendEmail(Mockito.anyString(), Mockito.anyString(), Mockito.anyString());

// ����� ����� ���������, ������� ��� ��� ������ ������ ����� EmailService, ���� �� ����
// verify(emailService, times(1)).anotherMethod(Mockito.any());

    }
}