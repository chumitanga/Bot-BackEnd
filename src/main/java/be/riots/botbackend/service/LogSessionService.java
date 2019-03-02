package be.riots.botbackend.service;

import be.riots.botbackend.model.LogSession;
import be.riots.botbackend.repository.LogSessionRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

@Service
public class LogSessionService {
    @Autowired
    LogSessionRepository logSessionRepository;

    public LogSession readJsonFileWithObjectMapper() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        LogSession logSession = objectMapper.readValue(new File("C:\\Users\\JaSt\\Desktop\\Bot-BackEnd\\src\\main\\resources\\logsession.json"), LogSession.class);
        return logSession;
    }

    public void writeLogSessionObjectToDatabase() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        LogSession logSession = objectMapper.readValue(new File("C:\\Users\\JaSt\\Desktop\\Bot-BackEnd\\src\\main\\resources\\logsession.json"), LogSession.class);

        selectLogSessionById();
        logSessionRepository.save(logSession);

    }

    private void selectLogSessionById() {

        //retrieve froim db??
    }
}
