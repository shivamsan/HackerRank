import java.util.Scanner;

public class Java_IfElse {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();

        if (N % 2 == 0) {
            if (2 <= N && N <= 5)
                System.out.println("Not Weird");
            else if (6 <= N && N <= 20)
                System.out.println("Weird");
            else if (N > 20)
                System.out.println("Not Weird");

        }

        else
            System.out.println("Weird");

        scanner.close();
    }

}
