import java.util.*;

public class Two_Functions {

    // Factorial
    public static int CalFactorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    // Binomial Coefficient - nCr
    public static int BinCoeff(int n, int r) {
        int a = CalFactorial(n);
        int b = CalFactorial(r);
        int c = CalFactorial(n - r);

        return a / (b * c);
    }
    // nPr
    public static int nPr(int n, int r){
        int a = CalFactorial(n);
        int b = CalFactorial(n-r);

        return a / b;
    }

    public static void main(String[] args) {
        // Factorial
        // System.out.print("Enter the num to calculate the factorial : ");
        Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // System.out.println("The Factorial of " + num + " is " + CalFactorial(num));
        
        // Binomial Coefficient
        System.out.print("Enter n(always n>r) : ");
        int n = sc.nextInt();
        System.out.print("Enter r : ");
        int r = sc.nextInt();
        System.out.println("The binomial coefficient with " + n + " and " + r + " is " + BinCoeff(n, r));
        sc.close();
    }
}
