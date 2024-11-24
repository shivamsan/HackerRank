import java.io.*;
import java.util.*;

public class Java_ExceptionHandlingTrycatch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int result = x / y;
            System.out.println(result);

        } catch (InputMismatchException q) {
            System.out.println("java.util.InputMismatchException");
        } catch (Exception e) {
            System.out.println(e);
        }

        finally {
            sc.close();
        }

    }
}
