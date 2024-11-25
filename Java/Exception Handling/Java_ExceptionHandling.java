import java.util.Scanner;
import java.math.*;

class MyCalculator {

    public static long power(int a, int b) throws Exception {
        long la = a;
        long lb = b;
        long res = (long) Math.pow(la, lb);
        if (la == 0 && lb == 0) {
            throw new Exception("n and p should not be zero.");

        } else if (la < 0 || lb < 0) {
            throw new Exception("n or p should not be negative.");

        } else
            return res;
    }
}

public class Java_ExceptionHandling {
    public static final Scanner sc = new Scanner(System.in);
    public static final MyCalculator my_calculator = new MyCalculator();

    public static void main(String[] args) {

        while (sc.hasNextInt()) {
            try {
                int n = sc.nextInt();
                int p = sc.nextInt();

                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
