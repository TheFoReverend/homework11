import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<String> strings = List.of("Danylo", "Petro", "Olha", "Tamara", "Vasyl'");
        List<String> result = processStrings(strings);
        System.out.println(result);
    }

    private static List<String> processStrings(List<String> strings) {
        return strings.stream()
                .map(String::toUpperCase)
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
    }
}

