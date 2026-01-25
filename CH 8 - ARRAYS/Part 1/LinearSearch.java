import java.util.*;

public class LinearSearch {
    // Linear Search
    public static int LSearch(int numbers[], int key) {

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        System.out.print("Enter the key : ");
        int key = sc.nextInt();
        int index = LSearch(numbers, key);
        System.out.println("The key is at index " + index);
        sc.close();
    }
}