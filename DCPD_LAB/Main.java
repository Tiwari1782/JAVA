import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a : ");
        // int a = sc.nextInt();
        // System.out.print("Enter b : ");
        // int b = sc.nextInt();
        // int c = a + b;
        // System.out.println("The sum of "+a+" and "+ b + " is : " + c);
        // System.out.print("Enter value of integer : ");
        // int a = sc.nextInt();
        // System.out.println("The value of integer is " + a);
        //Integer input
        System.out.print("Enter value of float : ");
        float flt = sc.nextFloat();
        System.out.println("The value of price is " + flt);
        //Float input
        System.out.print("Enter the double value : ");
        double dbl = sc.nextDouble();
        System.out.println("The value of double is " + dbl);
        //Char input
        System.out.print("Enter value of char : ");
        char ch = sc.next().charAt(0);
        System.out.println("The value of char is " + ch);
        //String input
        System.out.print("Enter value of String : ");
        String stg = sc.nextLine();
        System.out.println("The value of string is " + stg);
        // float a = 14.543287f;
        // System.out.println(a);

        sc.close();
    }
}
