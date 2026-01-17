import java.util.*;

public class Prime {

    // Prime Code
    public static boolean isPrime(int n) {
        boolean isPrime = true;

        // Corner Case
        if (n == 2) {
            return isPrime;
        }
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) { //
                isPrime = false;
                return isPrime;
            }
        }
        return isPrime;
    }

    // Optimised method for Prime
    public static boolean isPrime1(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Primes in range
    public static void PrimesInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num to check prime : ");
        int num = sc.nextInt();
        System.out.println("The number " + num + " is prime : " + isPrime(num));
        System.out.println("The number " + num + " is prime : " + isPrime1(num));
        System.out.print("Prime numbers between " + "1 and " + num + " are : ");
        PrimesInRange(num); 
        System.out.println();
        sc.close();
    }
}
