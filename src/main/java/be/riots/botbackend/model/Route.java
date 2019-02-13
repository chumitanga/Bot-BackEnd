package be.riots.botbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Routes")
@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class Route {
    String startPosition;
    String endPosition;
}
