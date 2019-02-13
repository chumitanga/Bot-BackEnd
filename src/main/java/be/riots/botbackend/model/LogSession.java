package be.riots.botbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;

@Entity
@Table(name="LogSessions")
@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class LogSession {

    @Column
    private LocalDate date;

    @OneToMany(mappedBy = "brewer", cascade = CascadeType.REMOVE)
    private ArrayList<Log> logs;

    @ManyToOne
    @JoinColumn(name="CategoryId")
    private User user;

}
