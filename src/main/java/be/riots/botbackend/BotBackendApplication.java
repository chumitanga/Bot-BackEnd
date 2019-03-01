package be.riots.botbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "be.riots.botbackend")
public class BotBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BotBackendApplication.class, args);
    }

}

