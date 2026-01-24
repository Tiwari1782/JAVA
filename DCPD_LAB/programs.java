import java.util.*;

public class programs {
    public static int count(int num) {
        int temp = num;
        int count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        return count;
    }

    public static int sum(int num) {
        int temp = num;
        int sum = 0;
        while (temp != 0) {
            int last_digit = temp % 10;
            sum += last_digit;
            temp /= 10;
        }
        // System.out.println("The sum of digits of " + num + " is " + sum);
        return sum;
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
        while (temp > 10) {
            int digit = temp % 10;
            temp /= 10;
        }
        first_digit = temp;
        System.out.println("The first digit is : " + first_digit);
        System.out.println("The last digit is : " + last_digit);
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

    public static void perfectNum(int num) {
        int temp = num;
        int sum = 0;
        for (int i = 1; i < temp; i++) {
            if (temp % i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
    }

    public static void niven(int num) {
        // Number divisible by sum of its digits eg - 18 → sum=9, 18%9=0
        int sum = sum(num);
        if (num % sum == 0) {
            System.out.println(num + " is a niven number.");
        } else{
            System.out.println(num + " is not a niven number.");
        }
    }
    public static void neon(int num){
        //Sum of digits of square = number
        int square = Math.powExact(num, 2);
        int sum = sum(square);
        if(sum == num){
            System.out.println(num+" is a neon number.");
        } else{
            System.out.println(num+" is a not neon number.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num : ");
        int n = sc.nextInt();
        // armstrong(n);
        // first_last(n);
        // perfectNum(n);
        // niven(n);
        neon(n);
        sc.close();
    }
}
