import java.util.*;

public class first {
    // Table by for Loop
    public static void table(int num) {
        System.out.println("The table of " + num + " is : ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }

    // Reverse by while loop
    public static void reverse(int num) {
        int temp = num;
        int reverse = 0;
        while (temp != 0) {
            int last_digit = temp % 10;
            reverse = reverse * 10 + last_digit;
            temp /= 10;
        }
        System.out.println("The original number is : " + num);
        System.out.println("The reversed number is : " + reverse);
    }

    // Sum of digits of a num
    public static void sumdigit(int num) {
        int sum = 0;
        int temp = num;
        do {
            int last_digit = temp % 10;
            sum += last_digit;
            temp /= 10;
        } while (temp > 0);
        System.out.println("Sum of digits of number " + num + " is " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num : ");
        int num = sc.nextInt();
        // table(num);
        // reverse(num);
        sumdigit(num);
        sc.close();
    }
}
