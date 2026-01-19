import java.util.*;

public class Pairs {
    public static void getPairs(int arr[]) {
        int total_pair = 0;
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + curr + ", " + arr[j] + ") ");
                total_pair++;
            }
            System.out.println();
        }
        System.out.println("The total pairs are : " + total_pair);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 2, 4, 6, 8, 10 };
        getPairs(arr);
        sc.close();
    }
}
