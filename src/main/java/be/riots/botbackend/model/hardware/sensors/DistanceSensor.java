package be.riots.botbackend.model.hardware.sensors;

import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;

public class DistanceSensor extends Sensor implements Sensorable {




    @NotEmpty
    private Double distance;

    public DistanceSensor() {
    }
    public DistanceSensor(@NotEmpty Double distance) {
        this.distance = distance;
    }
}
