import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        String[] array = {"1, 2, 0", "4, 5"};
        String result = getSortedNumbers(array);
        System.out.println(result);
    }

    private static String getSortedNumbers(String[] array) {
        List<Integer> numbers = new ArrayList<>();

        Arrays.stream(array)
                .map(str -> str.split(",\\s*"))
                .flatMap(Arrays::stream)
                .map(String::trim)
                .map(Integer::parseInt)
                .forEach(numbers::add);

        numbers.sort(null);

        return numbers.stream()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
    }
}
