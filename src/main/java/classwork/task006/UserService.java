package classwork.task006;

public class UserService {
    private final EmailService emailService;

    public UserService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void registerUser(String email) {
// ������ ����������� ������������
// ...

// �������� ��������������� ������
        emailService.sendEmail(email, "����� ����������!", "����� ���������� � ���� ����������!");
    }
}
