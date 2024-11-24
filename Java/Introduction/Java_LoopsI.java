import java.io.IOException;
import java.util.Scanner;

public class Java_LoopsI {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if ((n > 0) && (n < 21)) {
            for (int i = 1; i < 11; i++) {
                System.out.println(n + " x " + i + " = " + n * i);
            }
        }
    }

}
