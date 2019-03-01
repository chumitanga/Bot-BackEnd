package be.riots.botbackend.model.hardware.sensors;

import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;

public class DistanceSensor extends Sensor implements Sensorable {

    @NotEmpty
    private BigDecimal distance;

    private int id;

    public DistanceSensor(int id) {
        super(id);
        this.id = id;
    }
}
