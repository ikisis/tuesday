package project.weekday.repository.map;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import lombok.val;
import project.weekday.tuesday.config.KeyValueConfig;
import project.weekday.tuesday.domain.User;
import project.weekday.tuesday.repository.map.UserMapRepository;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = KeyValueConfig.class)
public class UserMapRepositoryTest {

    @Autowired
    UserMapRepository repository;

    @Test
    public void test() {
        
        val user = new User("id", "John Doe", "2020.05.15", "nothing");

        repository.save(user);

        assertEquals("John Doe", repository.findById("id").get().getName());

    }

}