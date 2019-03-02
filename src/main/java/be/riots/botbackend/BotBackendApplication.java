package be.riots.botbackend;

import be.riots.botbackend.service.LogSessionService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.io.IOException;

@SpringBootApplication(scanBasePackages = "be.riots.botbackend")
public class BotBackendApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                SpringApplication.run(BotBackendApplication.class, args);
        LogSessionService logSessionService = applicationContext.getBean(LogSessionService.class);

        try {
           logSessionService.writeLogSessionObjectToDatabase();
       }
       catch(IOException ioe){
           System.out.println("Exception! Printing stack trace.");
           ioe.printStackTrace();
        }


    }

}

