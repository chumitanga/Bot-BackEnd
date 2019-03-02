package be.riots.botbackend.model;

import be.riots.botbackend.model.hardware.sensors.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
public class Log {

    private int id;

    private LogType typeOfLog;
    private LocalDateTime dateTime;
    private AirSensor airSensor;
    private Camera camera;
    private DepthSensor depthSensor;
    private DistanceSensor distanceSensor;
    private GpsSensor gpsSensor;
    private LightSensor lightSensor;
    private TiltSensor tiltSensor;

    private String comment;

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

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public AirSensor getAirSensor() {
        return airSensor;
    }

    public void setAirSensor(AirSensor airSensor) {
        this.airSensor = airSensor;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public DepthSensor getDepthSensor() {
        return depthSensor;
    }

    public void setDepthSensor(DepthSensor depthSensor) {
        this.depthSensor = depthSensor;
    }

    public DistanceSensor getDistanceSensor() {
        return distanceSensor;
    }

    public void setDistanceSensor(DistanceSensor distanceSensor) {
        this.distanceSensor = distanceSensor;
    }

    public GpsSensor getGpsSensor() {
        return gpsSensor;
    }

    public void setGpsSensor(GpsSensor gpsSensor) {
        this.gpsSensor = gpsSensor;
    }

    public LightSensor getLightSensor() {
        return lightSensor;
    }

    public void setLightSensor(LightSensor lightSensor) {
        this.lightSensor = lightSensor;
    }

    public TiltSensor getTiltSensor() {
        return tiltSensor;
    }

    public void setTiltSensor(TiltSensor tiltSensor) {
        this.tiltSensor = tiltSensor;
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
