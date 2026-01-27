import java.util.*;

public class BitManipulation {
    public static void oddEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            // Even number
            System.out.println("Even number");
        } else {
            // Odd Number
            System.out.println("Odd number");
        }
    }

    // Get ith bit
    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    // Set Ith bit
    public static int SetIthbit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    // Clear Ithbit
    public static int clearIthbit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    // Update Ith bit
    public static int updateIthbit(int n, int i, int newBit) {
        if (newBit == 0) {
            return clearIthbit(n, i);
        } else {
            return SetIthbit(n, i);
        }
    }

    // Clear last i bits
    public static int clearIbits(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    // Check power of 2
    public static boolean isPowerofTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    // Count set bits in a number
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) { // check our LSB
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    // Fast Exponentiation
    public static int fastExpo(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) { // check LSB
                ans *= a;
            }
            a *= a;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter n : ");
        // int n = sc.nextInt();
        // oddEven(n);
        // System.out.println(getIthBit(10, 3));
        // System.out.println(SetIthbit(10, 3));
        // System.out.println(clearIthbit(10, 3));
        System.out.println(fastExpo(5, 3));
        sc.close();
    }
}
