import java.util.*;

public class ArraysCC {
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        // Creating An array
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[50];
        int numbers[] = { 1, 2, 3 };
        String fruits[] = { "apple", "banana", "cherry" };

        System.out.print("Enter marks for 0th index : ");
        marks[0] = sc.nextInt();
        System.out.print("Enter marks for 1st index : ");
        marks[1] = sc.nextInt();
        System.out.print("Enter marks for 2nd index : ");
        marks[2] = sc.nextInt();

        // System.out.println("phy : " + marks[0]);
        // System.out.println("eng : " + marks[1]);
        // System.out.println("math : " + marks[2]);
        System.out.println("The length of the array marks is " + marks.length);
        update(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        sc.close();

    }
}
