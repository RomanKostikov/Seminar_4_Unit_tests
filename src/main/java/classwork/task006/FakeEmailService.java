package classwork.task006;

import java.util.ArrayList;
import java.util.List;

public class FakeEmailService implements EmailService {
    private final List<EmailMessage> sentMessages = new ArrayList<>();

    @Override
    public void sendEmail(String to, String subject, String body) {
// Вместо реальной отправки сохраняем сообщение
        EmailMessage emailMessage = new EmailMessage(to, subject, body);
        sentMessages.add(emailMessage);
    }

    public List<EmailMessage> getSentMessages() {
        return sentMessages;
    }
}
