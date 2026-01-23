import java.util.*;

public class Matrices {

    // Input matrix
    public static void input(int matrix[][]) {
        Scanner sc = new Scanner(System.in);
        int n = matrix.length;
        int m = matrix[0].length;

        System.out.println("Enter matrix elements:");
        for (int rows = 0; rows < n; rows++) {
            for (int cols = 0; cols < m; cols++) {
                System.out.print("Element (" + rows + ", " + cols + ") : ");
                matrix[rows][cols] = sc.nextInt();
            }
        }
        sc.close();
    }

    // Output matrix
    public static void output(int matrix[][]) {
        int n = matrix.length;
        int m = matrix[0].length;

        System.out.println("\nMatrix elements are:");
        for (int rows = 0; rows < n; rows++) {
            for (int cols = 0; cols < m; cols++) {
                System.out.print(matrix[rows][cols] + " ");
            }
            System.out.println();
        }
    }

    // Search element in matrix
    public static void elementSearch(int matrix[][]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter element to search: ");
        int key = sc.nextInt();

        int n = matrix.length;
        int m = matrix[0].length;

        boolean found = false;

        for (int rows = 0; rows < n; rows++) {
            for (int cols = 0; cols < m; cols++) {
                if (matrix[rows][cols] == key) {
                    System.out.println("Element found at index (" + rows + ", " + cols + ")");
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        if (!found) {
            System.out.println("Element not found!!");
        }
        sc.close();
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];

        input(matrix);
        output(matrix);
        elementSearch(matrix);
    }
}
