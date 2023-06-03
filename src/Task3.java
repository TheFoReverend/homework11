import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        String[] array = {"1, 2, 0", "4, 5"};
        String result = getSortedNumbers(array);
        System.out.println(result);
    }

    private static String getSortedNumbers(String[] array) {
        List<Integer> numbers = new ArrayList<>();

        for (String str : array) {
            String[] parts = str.split(",\\s*");
            for (String part : parts) {
                int number = Integer.parseInt(part.trim());
                numbers.add(number);
            }
        }

        Collections.sort(numbers);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numbers.size(); i++) {
            sb.append(numbers.get(i));
            if (i < numbers.size() - 1) {
                sb.append(", ");
            }
        }

        return sb.toString();
    }
}
