import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Java_BigDecimal {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Read input
        int n = sc.nextInt(); // Number of test cases
        sc.nextLine(); // Consume the newline character after nextInt()

        List<String> numbers = new ArrayList<>();

        // Read all the BigDecimal numbers as strings
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextLine());
        }

        // Create a comparator to compare BigDecimal values in descending order
        Collections.sort(numbers, new Comparator<String>() {
            public int compare(String a, String b) {
                // Convert the strings to BigDecimal and compare them
                BigDecimal bigA = new BigDecimal(a);
                BigDecimal bigB = new BigDecimal(b);
                return bigB.compareTo(bigA); // Reverse order to get descending
            }
        });

        // Print the sorted numbers
        for (String number : numbers) {
            System.out.println(number);
        }
    }

}
