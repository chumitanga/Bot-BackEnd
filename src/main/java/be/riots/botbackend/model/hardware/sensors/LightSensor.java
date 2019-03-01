package be.riots.botbackend.model.hardware.sensors;

import javax.validation.constraints.NotEmpty;

public class LightSensor extends Sensor implements Sensorable {

    @NotEmpty
    private int lux;

    private int id;

    public LightSensor(int id) {
        super(id);
        this.id = id;
    }
}
