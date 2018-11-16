package jmsexample.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import javax.jms.ConnectionFactory;

@Configuration
@EnableJms
public class JmsConfig {
    private Environment environment;

    public JmsConfig(Environment environment) {
        this.environment = environment;
    }

    @Bean
    public JmsListenerContainerFactory<?> jmsListenerContainerFactory(
            ConnectionFactory connectionFactory,
            DefaultJmsListenerContainerFactoryConfigurer configurer
    ) {
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
        factory.setMaxMessagesPerTask(Integer.valueOf(
                environment.getProperty("jms.listener_container_factory.max_message_per_task", "1")));
        factory.setConcurrency(
                environment.getProperty("jms.listener_container_factory.concurrency", "1"));
        configurer.configure(factory, connectionFactory);
        return factory;
    }
}
