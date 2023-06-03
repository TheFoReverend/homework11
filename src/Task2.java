import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> strings = List.of("Danylo", "Petro", "Olha", "Tamara", "Vasyl'");
        List<String> result = processStrings(strings);
        System.out.println(result);
    }

    private static List<String> processStrings(List<String> strings) {
        List<String> processedStrings = new ArrayList<>();

        for (String str : strings) {
            String processedStr = str.toUpperCase();
            processedStrings.add(processedStr);
        }

        Collections.sort(processedStrings, Collections.reverseOrder());

        return processedStrings;
    }
}
