import java.util.*;

public class CallValue {

    public static void SwapByValue(int a, int b) { //Call by reference
        System.out.println("The value before swapping " + a + " and " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("The values after swapping are " + a + " and " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        SwapByValue(a, b);
        sc.close();
    }
}
