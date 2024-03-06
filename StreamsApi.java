import java.util.List;
import java.util.stream.Collectors;

public class StreamsApi {
    public static void main(String[] args) {
        List<String> names = List.of("Deepak","Abha","Deeksha","Anchal","Gautam");

        List<String> sortedNames = names.stream().filter(a -> a.startsWith("A")).collect(Collectors.toList());
        System.out.println(sortedNames);
        System.out.println(names.stream().sorted((a,b) -> a.compareTo(b)).collect(Collectors.toList()));
        List<String> newname = List.of("One","Two", "Three", "Four","Five");
        System.out.println(newname);
        
    }
}
