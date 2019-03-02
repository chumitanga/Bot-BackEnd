package be.riots.botbackend;

import be.riots.botbackend.service.LogSessionService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

import java.io.IOException;
@Import(RepositoryRestMvcConfiguration.class)
@SpringBootApplication(scanBasePackages = "be.riots.botbackend")
public class BotBackendApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                SpringApplication.run(BotBackendApplication.class, args);
        LogSessionService logSessionService = applicationContext.getBean(LogSessionService.class);

        try {
           logSessionService.readJsonFileWithObjectMapper();
       }
       catch(IOException ioe){
           System.out.println("Exception! Printing stack trace.");
           ioe.printStackTrace();
        }

    }

}

