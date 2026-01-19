import java.util.*;

public class BinarySearch {
    // Binary Search
    public static int binarysearch(int arr[], int key) {
        int start = 0, end = arr.length-1;
        while (start<=end) {
            int mid = start + (end-start)/2;

            //Comparisons
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                end = mid -1;
            }
            else if(arr[mid]<key){
                start = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 10;
        int index = binarysearch(arr, key);
        System.out.println("The index of the key : " + key + " is " + index);
        sc.close();
    }
}
