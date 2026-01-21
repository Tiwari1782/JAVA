import java.util.*;

public class MaxSubarray {

    public static void BruteForce(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                currSum = 0;
                int end = j;
                for (int k = start; k <= end; k++) {
                    // Subarray Sum
                    currSum += arr[k];
                }
                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum : " + maxSum);
    }

    public static void PrefixSum(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];

        // Calculate Prefix Array
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum : " + maxSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, -2, 6, -1, 3 };
        // BruteForce(arr);
        PrefixSum(arr);
        sc.close();
    }
}
