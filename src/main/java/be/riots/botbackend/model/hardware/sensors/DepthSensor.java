package be.riots.botbackend.model.hardware.sensors;

import javax.validation.constraints.NotEmpty;

public class DepthSensor extends Sensor implements Sensorable {

    @NotEmpty
    private int id;

}
