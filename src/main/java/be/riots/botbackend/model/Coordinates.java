package be.riots.botbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Component;

import javax.persistence.Embeddable;

//are these components though?? kinda.. but??
@Embeddable
@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class Coordinates {

    private long latitude = 102;
    private long longitude= 150;

    public Coordinates() {
    }


    public long getLatitude() {
        return latitude;
    }

    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }

    public long getLongitude() {
        return longitude;
    }

    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
