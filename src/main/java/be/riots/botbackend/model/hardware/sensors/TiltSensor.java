package be.riots.botbackend.model.hardware.sensors;

import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;

public class TiltSensor extends Sensor implements Sensorable {

    @NotEmpty
    private BigDecimal yawn;

    @NotEmpty
    private BigDecimal roll;

    @NotEmpty
    private BigDecimal pitch;

    public BigDecimal getYawn() {
        return yawn;
    }

    public void setYawn(BigDecimal yawn) {
        this.yawn = yawn;
    }

    public BigDecimal getRoll() {
        return roll;
    }

    public void setRoll(BigDecimal roll) {
        this.roll = roll;
    }

    public BigDecimal getPitch() {
        return pitch;
    }

    public void setPitch(BigDecimal pitch) {
        this.pitch = pitch;
    }
}
