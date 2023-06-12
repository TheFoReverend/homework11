import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task1 {
    public static void main(String[] args) {
        List<String> names = List.of("Danylo", "Petro", "Olha", "Tamara", "Vasyl'");
        String result = getNamesString(names);
        System.out.println(result);
    }

    private static String getNamesString(List<String> names) {
        return IntStream.range(1, names.size())
                .filter(i -> i % 2 == 1)
                .mapToObj(i -> i + ". " + names.get(i))
                .collect(Collectors.joining(", "));
    }
}
