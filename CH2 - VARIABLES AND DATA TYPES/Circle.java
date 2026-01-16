import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle : ");
        Float r = sc.nextFloat();
        System.out.print("The area of circle with radius " + r + " is ");
        Float area = 3.14f * r * r;
        System.out.println(area);
        sc.close();
    }
}
