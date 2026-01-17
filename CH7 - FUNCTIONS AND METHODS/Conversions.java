import java.util.*;

public class Conversions {

    // Binary to decimal
    public static void binTodec(int binNum) {
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));

            pow++;
            binNum = binNum / 10;
        }
        System.out.println("Decimal of " + binNum + " = " + decNum);
    }

    // Decimal to binary
    public static void decTobin(int decNum) {
        int orig = decNum;
        int pow = 0;
        int binNum = 0;

        while (decNum > 0) {
            int rem = decNum % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            decNum = decNum / 2;
        }
        System.out.println("Binary of " + decNum + " is " + binNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary number : ");
        int BinNum = sc.nextInt();
        binTodec(BinNum);
        System.out.print("Enter the decimal number : ");
        int decNum = sc.nextInt();
        decTobin(decNum);
        sc.close();
    }
}
