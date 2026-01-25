import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter value of b : ");
        int b = sc.nextInt();
        int product = a * b;
        System.out.print("The product of " + a + " and " + b + " is ");
        System.out.println(product);
        sc.close();
    }
}
