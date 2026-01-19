import java.util.*;

public class SubArrays {

    public static void printSubarrays(int arr[]) {
        int total_pairs = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;

            for (int j = i; j < arr.length; j++) {
                int end = j;

                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                total_pairs++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("The total subarrays : " + total_pairs);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        printSubarrays(arr);
    }
}
