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

    public User() {
    }

    public User(String username, String password, ArrayList<LogSession> logSessions, ArrayList<Route> routes) {
        this.username = username;
        this.password = password;
        this.logSessions = logSessions;
        this.routes = routes;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<LogSession> getLogSessions() {
        return logSessions;
    }

    public void setLogSessions(ArrayList<LogSession> logSessions) {
        this.logSessions = logSessions;
    }

    public ArrayList<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(ArrayList<Route> routes) {
        this.routes = routes;
    }

    @Override
    public int compareTo(User user) {
        return this.getUsername().compareTo(user.getUsername());
    }
}
