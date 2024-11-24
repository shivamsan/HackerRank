import java.util.Scanner;

public class Java_Endoffile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 1;

        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            System.out.println(count + " " + str);
            count++;
        }

    }

}
