import java.io.*;
import java.util.*;

public class Java_StringsIntroduction {

    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String s1 = sc.next();
        String s2 = sc.next();

        System.out.println(s1.length() + s2.length());

        if (s1.compareTo(s2) > 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println(s1.substring(0, 1).toUpperCase() + s1.substring(1) + " " + s2.substring(0, 1).toUpperCase()
                + s2.substring(1));

    }
}
