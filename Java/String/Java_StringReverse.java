import java.util.Scanner;

public class Java_StringReverse {
    public static final Scanner sc = new Scanner(System.in);

    public static String palindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end))
                return "No";
            start++;
            end--;

        }
        return "Yes";
    }

    public static void main(String[] args) {

        String s = sc.next();

        System.out.print(palindrome(s));

    }

}
