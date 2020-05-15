package project.weekday.tuesday.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.keyvalue.annotation.KeySpace;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@KeySpace("user")
public class User {

    public static final User IKISIS = new User("ikisis", "sangwook.park", "1981.04.15", "developer");

    @Id
    private final String id;
    private final String name;
    private final String birth;
    private final String role;
}