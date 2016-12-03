package mail;

import org.springframework.stereotype.Service;

@Service("emailService")
public interface EmailService {
    void sendEmail(String to, String subject, String text);
}
