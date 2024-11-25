import java.math.BigInteger;
import java.util.Scanner;

public class Java_PrimalityTest {
    // Method to check if a BigInteger is prime
    public static boolean isPrime(BigInteger number) {
        // BigInteger provides an efficient method to check primality
        return number.isProbablePrime(1); // 1 indicates a certainty level for the check
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the input number as a BigInteger
        BigInteger number = sc.nextBigInteger();

        // Check if the number is prime
        if (isPrime(number)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

        sc.close();
    }

}
