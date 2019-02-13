package be.riots.botbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name="Users")
@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class User implements Comparable<User> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private int id;

    @Column(name="Username")
    private String username;

    @Column(name="Password")
    private String password;

    @OneToMany(mappedBy = "brewer") //CASCADE TYPE???????
    private ArrayList<LogSession> logSessions;

    @OneToMany(mappedBy = "brewer", cascade = CascadeType.REMOVE)
    ArrayList<Route> routes;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public int compareTo(User user) {
        return this.getUsername().compareTo(user.getUsername());
    }
}
