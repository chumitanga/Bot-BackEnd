package be.riots.botbackend.controller;

import be.riots.botbackend.repository.UserRepository;
import org.aspectj.weaver.ast.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@Component
@RestController
public class UserController {

    @Autowired //!!!!!
    private UserRepository repo;


    @PostConstruct
    public void init() {
        repo.setClazz(Test.class);
    }
//    /*
//    prints one user by id
//     */
//    @RequestMapping("/mountain/{id}")//web listener servlet name
//    public User user(@PathVariable long id) {
//        return repo.getUserById(id);
//    }
//
//    /*
//    prints the list of users
//     */
//    @RequestMapping("/mountains")
//    public List<User> users() {
//        return repo.getUsers();
//    }
//

}
