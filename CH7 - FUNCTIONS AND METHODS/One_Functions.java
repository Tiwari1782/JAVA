import java.util.*;

public class One_Functions {

    public static void printHello() {
        System.out.println("Hello World!!");
    }

    public static void CalSum(int a, int b) { //Parametric Function
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a : ");
        // int a = sc.nextInt();
        // System.out.print("Enter b : ");
        // int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " is " + sum);
        sc.close();
    }

    public static void main(String[] args) {
        printHello();
        CalSum(3,4);
    }
}
