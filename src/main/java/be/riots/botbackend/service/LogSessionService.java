package be.riots.botbackend.service;

import be.riots.botbackend.model.LogSession;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class LogSessionService {


    public LogSession readJsonWithObjectMapper() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        LogSession logSession = objectMapper.readValue(new File("C:\\Users\\JaSt\\Desktop\\Bot-BackEnd\\src\\main\\resources\\logsession.json"), LogSession.class);
        //logger.info(log.toString());
        return logSession;
    }

    public static void main(String[] args) throws IOException {
        LogSessionService service = new LogSessionService();
        service.readJsonWithObjectMapper();

    }
}
