package be.riots.botbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name="Logs")
@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class Log {

    @Column
    private LogType typeOfLog;

    @Column
    private GpsSensor gpsSensor;

    @Column
    private DepthSensor depthSensor;

    @Column
    private MotionSensor motionSensor;

    @Column
    private String comment;

    @ManyToOne
    @JoinColumn(name="CategoryId")
    private LogSession logSession;


}
