package project.weekday;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.val;

/**
 * Hello world!
 *
 */
public class App 
{

    @Data
    @RequiredArgsConstructor
    public static class Domain {
        private final int id;
        private final String name;
    }
    public static void main( String[] args )
    {

        val domain = new Domain(1, "John Doe");
        System.out.println( "Hello World!" + domain );
    }
}
