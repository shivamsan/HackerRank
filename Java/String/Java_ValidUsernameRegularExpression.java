
import java.util.*;

public class Java_ValidUsernameRegularExpression {
    public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}";
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt(); // Read the number of test cases
        sc.nextLine(); // Consume the newline character

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine(); // Read the username

            if (s.matches(regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }

        }

    }

}
