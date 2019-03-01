package be.riots.botbackend.model;

import be.riots.botbackend.model.hardware.sensors.Camera;
import be.riots.botbackend.model.hardware.sensors.DepthSensor;
import be.riots.botbackend.model.hardware.sensors.GpsSensor;
import be.riots.botbackend.model.hardware.sensors.TiltSensor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
public class Log {

    private int id;

    private LogType typeOfLog;

    private GpsSensor gpsSensor;

    private DepthSensor depthSensor;

    private TiltSensor motionSensor;

    private Camera camera;

    private String comment;

    private LocalDateTime dateTime;

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

    public TiltSensor getMotionSensor() {
        return motionSensor;
    }

    public void setMotionSensor(TiltSensor motionSensor) {
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

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
