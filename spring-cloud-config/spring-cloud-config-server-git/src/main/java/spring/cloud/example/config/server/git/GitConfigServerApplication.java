package spring.cloud.example.config.server.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class GitConfigServerApplication {

    public static final void main(final String[] args) {
        SpringApplication.run(GitConfigServerApplication.class, args);
    }
}