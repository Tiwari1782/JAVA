import java.util.*;

public class Sorting {
    // Bubble Sort
    public static void bubbleSort(int arr[]) {
        int swaps = 0;
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
        }
        System.out.println("Swaps are " + swaps);
        System.out.println("Sorted Array is -->>>");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + (i + 1) + " is : " + arr[i]);
        }
    }

    // Selection Sort
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) { // if condition opposite descending sorting will happen
                    minPos = j;
                }
            }
            // Swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Sorted Array is -->>>");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + (i + 1) + " is : " + arr[i]);
        }
    }

    // Insertion Sort
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;

            // Finding correct position to insert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            // Insertion
            arr[prev + 1] = curr;
        }

        System.out.println("Sorted Array is -->>>");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + (i + 1) + " is : " + arr[i]);
        }
    }

    // Counting Sort
    public static void CountingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        // Sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        System.out.println("Sorted Array is -->>>");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + (i + 1) + " is : " + arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        // Arrays.sort(arr, 0, arr.length);
        // System.out.println("Sorted Array is -->>>");
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println("Element " + (i + 1) + " is : " + arr[i]);
        // }
        int arr1[] = { 1, 4, 1, 3, 2, 4, 3, 7 };
        CountingSort(arr1);
    }
}
