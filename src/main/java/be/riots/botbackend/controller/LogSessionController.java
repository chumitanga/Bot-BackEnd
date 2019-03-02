package be.riots.botbackend.controller;

import be.riots.botbackend.model.LogSession;
import be.riots.botbackend.repository.LogSessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/logSession")
public class LogSessionController {

    @Autowired
    private LogSessionRepository repo;

    @GetMapping
    public List<LogSession> test() {
        return repo.findAll();
    }

}
