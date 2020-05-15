package project.weekday;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Unit test for simple App.
 */
@Slf4j
public class AppTest 
{

    @Data
    @RequiredArgsConstructor
    public static class Domain {
        private final int id;
        private final String name;
    }
    
    @Test
    public void shouldAnswerWithTrue()
    {
        log.debug("test {}", new Domain(1, "John Doe"));
        assertEquals(true, true, "true should be true");
    }
}
