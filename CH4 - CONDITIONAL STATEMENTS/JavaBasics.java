import java.util.Scanner;

public class JavaBasics {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        //// Largest of two nums
        // System.out.print("Enter a : ");
        // int a = sc.nextInt();
        // System.out.print("Enter b : ");
        // int b = sc.nextInt();

        // if(a>=b){
        // System.out.println("A is largest");
        // } else{
        // System.out.println("B is largest");
        // }

        //// Odd Even
        // System.out.print("Enter num : ");
        // int num = sc.nextInt();
        // if (num % 2 == 0) {
        // System.out.println(num + " is even!!");
        // } else {
        // System.out.print(num + " is odd!!");
        // }

        //// Income Tax Calculator
        double income = 750000; // 7.5 Lakh
        double tax;

        if (income <= 250000) {
            tax = 0;
        } else if (income <= 500000) {
            tax = 0.05 * (income - 250000);
        } else if (income <= 1000000) {
            tax = 0.05 * 250000              // 2.5L–5L
                + 0.20 * (income - 500000);  // 5L–income
        } else {
            tax = 0.05 * 250000              // 2.5L–5L
                + 0.20 * 500000              // 5L–10L
                + 0.30 * (income - 1000000); // above 10L
        }

        System.out.println("Income: " + income);
        System.out.println("Tax: " + tax);
        sc.close();
    }
}
