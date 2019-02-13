package be.riots.botbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Component;

import javax.persistence.Embeddable;

@Embeddable
@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class DepthSensor {

    public DepthSensor() {
    }
}
