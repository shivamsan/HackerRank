import java.util.Scanner;

public class Java_InttoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n >= -100 && n <= 100)
            System.out.println("Good job");
        else
            System.out.println("Wrong answer");
    }

}
