package project.weekday.tuesday.repository.map;

import org.springframework.data.repository.CrudRepository;

import project.weekday.tuesday.domain.User;

public interface UserMapRepository extends CrudRepository<User, String> {
    
}