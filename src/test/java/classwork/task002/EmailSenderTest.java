package classwork.task002;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class EmailSenderTest {
    @Test
    void testSendEmailWithDummy() {
// ������� ��������� ������ Email
        Email dummyEmail = mock(Email.class);

// ������� ��������� EmailSender
        EmailSender emailSender = new EmailSender();

// �������� ����� sendEmail � ��������� �������� Email
        emailSender.sendEmail(dummyEmail);

// ���������, ��� � ��������� �������� Email �� ���� ��������������
        verifyNoMoreInteractions(dummyEmail);
    }
}