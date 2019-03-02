package be.riots.botbackend.model;

import be.riots.botbackend.model.hardware.Device;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document
public class User implements Comparable<User> {

    private int id;

    private String username;

    private String password;

    private String email;

    private Device device;

    private ArrayList<LogSession> logSessions;

    ArrayList<Route> routes;

    public User() {
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
