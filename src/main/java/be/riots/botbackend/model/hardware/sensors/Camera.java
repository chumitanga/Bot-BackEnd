package be.riots.botbackend.model.hardware.sensors;

import java.sql.Blob;

public class Camera extends Sensor implements Sensorable {

    private int id;

    private Blob foto;

    public Camera(int id) {
        super(id);
        this.id = id;
    }
}
