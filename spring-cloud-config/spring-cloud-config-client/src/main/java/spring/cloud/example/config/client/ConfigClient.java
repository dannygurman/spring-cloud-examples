package spring.cloud.example.config.client;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

//The @RefreshScope -A Scope implementation that allows for beans to be refreshed dynamically at runtime (see refresh(String) and refreshAll()).
@RefreshScope
@SpringBootApplication
public class ConfigClient {

    public static final void main(final String[] args) {
        SpringApplication.run(ConfigClient.class, args);
    }
}