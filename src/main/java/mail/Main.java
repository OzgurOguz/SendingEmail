package mail;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        String to = "xx@example.com";
        ApplicationContext context = new ClassPathXmlApplicationContext("mail.xml");
        EmailSender sender = (EmailSender) context.getBean("emailSender");
        sender.sendEmail(to, "natink", "watzap");
    }
}
