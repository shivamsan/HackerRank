import java.util.Scanner;

public class Java_OutputFormatting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] s = new String[3];
        int[] n = new int[3];

        for (int i = 0; i < 3; i++) {
            s[i] = sc.next();
            n[i] = sc.nextInt();
        }

        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%-15s%03d%n", s[i], n[i]);
        }
        System.out.println("================================");
        sc.close();
    }

}
