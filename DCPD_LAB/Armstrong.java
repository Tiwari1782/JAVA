import java.util.*;

public class Armstrong {
    public static int count(int num) {
        int temp = num;
        int count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        return count;
    }

    public static void sum(int num) {
        int temp = num;
        int sum = 0;
        while (temp != 0) {
            int last_digit = temp % 10;
            sum += last_digit;
            temp /= 10;
        }
        System.out.println("The sum of digits of " + num + " is " + sum);
    }

    public static void reverse(int num) {
        int temp = num;
        int reverse = 0;
        while (temp != 0) {
            int last_digit = temp % 10;
            reverse *= 10 + last_digit;
            temp /= 10;
        }
        System.out.println("The reverse of " + num + " is " + reverse);

    }

    public static void palindrome(int num) {
        int palindrome = 0;
        int temp = num;
        while (temp != 0) {
            int last_digit = temp % 10;
            palindrome *= 10 + last_digit;
            temp /= 10;
        }
        if (palindrome == num) {
            System.out.println("The number " + num + " is a palindrome number.");
        } else {
            System.out.println("The number " + num + " is not a palindrome number.");
        }
    }

    public static void first_last(int num) {
        int temp = num;
        int last_digit = temp % 10;
        int first_digit = 0;
        while (temp != 0) {
            int digit = temp % 10;

        }
    }

    public static void armstrong(int num) {
        int len = count(num);
        int temp = num;
        int newNum = 0;
        while (temp != 0) {
            int last_digit = temp % 10;
            newNum += Math.pow(last_digit, len);
            temp /= 10;
        }
        if (newNum == num) {
            System.out.println("The number " + num + " is an armstrong number.");
        } else {
            System.out.println("The number " + num + " is not an armstrong number.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num : ");
        int n = sc.nextInt();
        armstrong(n);
        sc.close();
    }
}
