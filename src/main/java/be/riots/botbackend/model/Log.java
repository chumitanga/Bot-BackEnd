package be.riots.botbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name="Logs")
@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private int id;

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

    public Log() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LogType getTypeOfLog() {
        return typeOfLog;
    }

    public void setTypeOfLog(LogType typeOfLog) {
        this.typeOfLog = typeOfLog;
    }

    public GpsSensor getGpsSensor() {
        return gpsSensor;
    }

    public void setGpsSensor(GpsSensor gpsSensor) {
        this.gpsSensor = gpsSensor;
    }

    public DepthSensor getDepthSensor() {
        return depthSensor;
    }

    public void setDepthSensor(DepthSensor depthSensor) {
        this.depthSensor = depthSensor;
    }

    public MotionSensor getMotionSensor() {
        return motionSensor;
    }

    public void setMotionSensor(MotionSensor motionSensor) {
        this.motionSensor = motionSensor;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LogSession getLogSession() {
        return logSession;
    }

    public void setLogSession(LogSession logSession) {
        this.logSession = logSession;
    }
}
