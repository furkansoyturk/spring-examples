package com.example.spring.examples.conditionalBeans;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class ConditionalBeansRunner implements CommandLineRunner {

    final private Message message;

    public ConditionalBeansRunner(Message message) {
        this.message = message;
    }


    //if welcomeMessage.enabled = true (in application.properties),
    // runner prints welcome message otherwise it prints generic message
    @Override
    public void run(String... args) {
        System.out.println(message.getMessage());
    }
}
