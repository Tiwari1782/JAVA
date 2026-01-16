import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //// Print 1 to 10
        // int i = 1;
        // while (i<=10) {
        // System.out.print(i + " ");
        // i++;
        // }
        //// Print 1 to n
        // System.out.print("Enter n : ");
        // int n = sc.nextInt();
        // int i = 1;
        // while (i<=n) {
        // System.out.print(i+" ");
        // i++;
        // }
        //// Sum of first n natural nums
        // System.out.print("Enter n : ");
        // int n = sc.nextInt();
        // int i = 1;
        // int sum = 0;
        // while (i <= n) {
        // sum += i;
        // i++;
        // }
        // System.out.println("The sum of numbers from 1 to " + n + " is " + sum);
        //// Print Square Pattern
        // System.out.print("Enter value of n : ");
        // int n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n; j++) {
        // System.out.print("* ");
        // }
        // System.out.println(); // nextline
        // }
        //// Reverse of a number
        // System.out.print("Enter a number : ");
        // int n = sc.nextInt();
        // int temp = n;
        // int reverse = 0;
        // while (temp!=0) {
        // int last_digit = temp % 10;
        // reverse = reverse*10 + last_digit;
        // temp/=10;
        // }
        // System.out.println("Reverse of "+ n +" is " + reverse);

        //// Keep entering num until user enter a multiple of 10;
        // do {
        //     System.out.print("Enter the num : ");
        //     int n = sc.nextInt();
        //     if (n % 10 == 0) {
        //         System.out.println("Loop ended");
        //         break;
        //     }
        // } while (true);
        sc.close();
    }
}
