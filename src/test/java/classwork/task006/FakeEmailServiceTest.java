package classwork.task006;


import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FakeEmailServiceTest {
    @Test
    void testRegisterUserWithFakeEmailService() {
// ������� �������� (����) EmailService
        FakeEmailService fakeEmailService = new FakeEmailService();

// ������� ������ UserService � ������ EmailService
        UserService userService = new UserService(fakeEmailService);

// �������� ����� registerUser
        userService.registerUser("user@example.com");

// �������� ������ ������������ ��������� �� �����
        List<EmailMessage> sentMessages = fakeEmailService.getSentMessages();

// ���������, ��� ���� ���������� ���� ���������
        assertEquals(1, sentMessages.size());

// ���������, ��� ������������ ��������� �������� ��������� ������
        EmailMessage emailMessage = sentMessages.get(0);
        assertEquals("user@example.com", emailMessage.getTo());
        assertEquals("����� ����������!", emailMessage.getSubject());
        assertEquals("����� ���������� � ���� ����������!", emailMessage.getBody());
    }
}