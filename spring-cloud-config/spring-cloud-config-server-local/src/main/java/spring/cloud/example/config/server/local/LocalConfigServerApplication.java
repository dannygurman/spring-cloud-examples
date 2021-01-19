package spring.cloud.example.config.server.local;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class LocalConfigServerApplication {

    public static final void main(final String[] args) {
        SpringApplication.run(LocalConfigServerApplication.class, args);
    }
}