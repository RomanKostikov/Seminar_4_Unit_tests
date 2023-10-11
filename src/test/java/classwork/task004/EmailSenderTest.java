package classwork.task004;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

//public class EmailSenderTest {
//    @Mock
//    private EmailService mockEmailService;
//
//    @BeforeEach
//    void setUp() {
//// �������������� ����
//        MockitoAnnotations.initMocks(this);
//    }
//
//    @Test
//    void testSendWelcomeEmail() {
//// ������� ��������� EmailSender � ����� EmailService
//        EmailSender emailSender = new EmailSender(mockEmailService);
//
//// �������� �����, ������� �� ����� ��������������
//        emailSender.sendWelcomeEmail("user@example.com");
//
//// ���������, ��� ����� sendEmail ��� ������ � ���������� �����������
//        verify(mockEmailService).sendEmail("user@example.com", "����� ����������!",
//                "����� ���������� � ���� ����������!");
//        verify(mockEmailService).sendEmail(eq("user@example.com"), any(), any());
//    }
//}
// �������������� ������������� �����.
@ExtendWith(MockitoExtension.class)
public class EmailSenderTest {

    @Mock
    private EmailService mockEmailService;

    @InjectMocks
    private EmailSender emailSender;

    @Test
    void testSendWelcomeEmail() {
// �������� �����, ������� �� ����� ��������������
        emailSender.sendWelcomeEmail("user@example.com");

// ���������, ��� ����� sendEmail ��� ������ � ���������� �����������
        verify(mockEmailService).sendEmail("user@example.com", "����� ����������!", "����� ���������� � ���� ����������!");
    }
}
