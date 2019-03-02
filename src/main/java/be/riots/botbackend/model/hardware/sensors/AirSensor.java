package be.riots.botbackend.model.hardware.sensors;

import javax.validation.constraints.NotEmpty;

public class AirSensor extends Sensor implements Sensorable {

    @NotEmpty
    private int co2PPM;

}
