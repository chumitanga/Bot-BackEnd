package be.riots.botbackend.model.hardware.sensors;

import javax.validation.constraints.NotEmpty;

public class AirSensor extends Sensor implements Sensorable {

    @NotEmpty
    private int co2PPM;

    public AirSensor(@NotEmpty int co2PPM) {
        this.co2PPM = co2PPM;
    }
}
