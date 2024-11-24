import java.util.Scanner;

public class Java_StaticInitializerBlock {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();
        int h = sc.nextInt();

        try {
            if (b <= 0 || h <= 0) {
                throw new Exception("Breadth and height must be positive");
            }
            System.out.print(b * h);
        } catch (Exception e) {
            System.out.println(e.getClass().getName() + ": " + e.getMessage());

            // or simple write
            // System.out.println(e);
        }

        finally {
            sc.close();
        }

    }

}
