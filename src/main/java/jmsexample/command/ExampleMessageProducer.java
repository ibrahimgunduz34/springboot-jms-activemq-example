package jmsexample.command;

import jmsexample.model.EmailMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class ExampleMessageProducer implements CommandLineRunner {
    @Autowired
    private JmsTemplate jmsTemplate;

    @Override
    public void run(String... args) throws Exception {
        for(int i = 0; i <= 1000; i++) {
            jmsTemplate.convertAndSend(
                    "email_messages",
                    new EmailMessage("ibrahimgunduz34@gmail.com", "deneme")
            );
        }
    }
}
