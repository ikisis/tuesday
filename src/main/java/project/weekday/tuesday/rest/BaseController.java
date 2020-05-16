package project.weekday.tuesday.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import project.weekday.tuesday.domain.User;
import project.weekday.tuesday.repository.map.UserMapRepository;

@RestController
public class BaseController {

    @Autowired
    private UserMapRepository userRepository;

    @GetMapping("rest/users/{id}")
    public User users(@PathVariable String id) {
        
        return this.userRepository
        .findById(id)
        .orElse(new User("invalid id!", "not found user!", null, "Ghost"));

    }
    


}