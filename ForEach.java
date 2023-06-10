import java.util.List;

public class ForEach {
    public static void main(String[] args) {

        List<String> names = List.of("Deepak", "Hello", "There", "Now", "No");

        names.forEach(name -> System.out.println(name.toUpperCase()));

        System.out.println(names);

    }
}
