package com.example.chatbot_rag;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.vaadin.flow.component.page.AppShellConfigurator;

@SpringBootApplication

public class ChatbotRagApplication implements AppShellConfigurator {

    public static void main(String[] args) {
        SpringApplication.run(ChatbotRagApplication.class, args);
    }
}
