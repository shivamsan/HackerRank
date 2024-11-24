import java.util.Scanner;

public class Java_StdinandStdoutII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Read integer
        int i = scan.nextInt();

        // Read Double
        double d = scan.nextDouble();

        // Important: Add this extra nextLine() to consume the leftover newline
        scan.nextLine();

        // Read the string line
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        scan.close();
    }

}
