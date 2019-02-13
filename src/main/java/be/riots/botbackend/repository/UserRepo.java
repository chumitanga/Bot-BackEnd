//package be.riots.botbackend.repository;
//
//import be.riots.botbackend.model.User;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.PostConstruct;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.concurrent.atomic.AtomicLong;
//
//@Component
//public class UserRepo {
//    private List<User> users = new ArrayList<>();
//   private final AtomicLong counter = new AtomicLong();
//
//    @PostConstruct
//    public void init() {
//
//    }
//
//    public List<User> getUsers() {
//        return users;
//    }
//
//    public void setUsers(List<User> mountains) {
//        this.users = mountains;
//    }
//
//    public User getUserById(long id) {
//
//        return findUserById(id);
//    }
//
//    private User findUserById(long id) {
//        //is casting truly the best solution here?
//        return users.get((int) id);
//    }
//
//    public void addUser(User user) {
//        this.users.add(user);
//    }
//}
