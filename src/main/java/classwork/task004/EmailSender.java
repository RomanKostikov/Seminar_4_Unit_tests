package classwork.task004;

public class EmailSender {
    private final EmailService emailService;

    public EmailSender(EmailService emailService) {
        this.emailService = emailService;
    }

    public void sendWelcomeEmail(String userEmail) {
        String subject = "����� ����������!";
        String body = "����� ���������� � ���� ����������!";
        emailService.sendEmail(userEmail, subject, body);
    }
}
