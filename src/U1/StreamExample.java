package U1;
import java.util.*;

public class StreamExample {
    public static void main(String[] args) {
        List<String>obj = Arrays.asList("Comps201", "HKMU","Comps311","Learning", "Java","Comps101","Comps359");

        obj
                .stream()
                .filter(s->s.startsWith("Comps"))
                .sorted()
                .forEach(System.out::println);
    }
}
