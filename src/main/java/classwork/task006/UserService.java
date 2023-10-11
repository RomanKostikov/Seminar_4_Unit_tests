package classwork.task006;

public class UserService {
    private final EmailService emailService;

    public UserService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void registerUser(String email) {
// Логика регистрации пользователя
// ...

// Отправка приветственного письма
        emailService.sendEmail(email, "Добро пожаловать!", "Добро пожаловать в наше приложение!");
    }
}
