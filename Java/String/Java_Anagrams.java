import java.util.Arrays;
import java.util.Scanner;

public class Java_Anagrams {
    public static String anagram(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if (s1 == null || s2 == null)
            return "Not Anagrams";

        if (s1.length() != s2.length())
            return "Not Anagrams";

        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        return Arrays.equals(a1, a2) ? "Anagrams" : "Not Anagrams";
    }

    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String s1 = sc.next();
        String s2 = sc.next();

        System.out.println(anagram(s1, s2));

    }

}
