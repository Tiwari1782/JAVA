import java.util.Scanner;

public class StairCase {
    public static boolean searchfromTop(int matrix[][], int key) {
        // From top cell - (0,m-1)
        int row = 0, col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("Found key at (" + row + ", " + col + ")");
                return true;
            } else if (matrix[row][col] > key) {
                col--; // Move left
            } else if (matrix[row][col] < key) {
                row++; // Move right
            }
        }
        System.out.println("Key not found!!");
        return false;
    }
    public static boolean searchfromBottom(int matrix[][], int key){
        // From bottom cell - (n-1,0)
        int row = matrix.length - 1, col = 0;
        while (col < matrix[0].length && row >= 0) {
            if (matrix[row][col] == key) {
                System.out.print("Found key at (" + row + ", " + col + ")");
                return true;
            } else if (matrix[row][col] > key) {
                row--;
            } else if (matrix[row][col] < key) {
                col++;
            }
        }
        System.out.println("Key not found!!");
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };
        System.out.print("Enter the key : ");
        int key = sc.nextInt();
        searchfromTop(matrix, key);
        searchfromBottom(matrix, key);
        sc.close();
    }
}
