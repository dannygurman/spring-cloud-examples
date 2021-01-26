package spring.cloud.example.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/myclient")
public class ConfigRestController {

    @Value("${greeting.message.1}")
    private String greetingMessage_1;

    @Value("${greeting.message.2}")
    private String greetingMessage_2;

    @GetMapping(path = "/message/{id}")
    public String getGreetingMessage1(@PathVariable(value = "id") Integer msgId) {
        if (msgId == 2){
            return greetingMessage_2;
        }else {
            return greetingMessage_1;
        }
    }

}
