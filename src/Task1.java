import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> names = List.of("Danylo", "Petro", "Olha", "Tamara", "Vasyl'");
        String result = getNamesString(names);
        System.out.println(result);
    }

    private static String getNamesString(List<String> names) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < names.size(); i += 2) {
            sb.append(i).append(". ").append(names.get(i));
            if (i < names.size() - 2) {
                sb.append(", ");
            }
        }

        return sb.toString();
    }
}
