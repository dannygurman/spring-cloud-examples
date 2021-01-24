package spring.cloud.example.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/myclient")
public class ConfigRestController {

    @Value("${greeting.message}")
    private String greetingMessage;

    @GetMapping(path = "/message")
    public String getGreetingMessage() {
        return greetingMessage;
    }
}
