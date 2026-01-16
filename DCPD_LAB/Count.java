import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num : ");
        int num = sc.nextInt();
        int count = 0;
        int temp = num;
        while (temp != 0) {
            int digit = temp % 10; //takes last digit
            count++;
            temp = temp / 10; //removes last digit
        }
        System.out.println("The count of " + num + " is " + count);
        sc.close();
    }
}
