import java.math.BigInteger;
import java.util.*;

public class Java_BigInteger {

    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String s1 = sc.next();
        String s2 = sc.next();

        BigInteger a = new BigInteger(s1);
        BigInteger b = new BigInteger(s2);

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}