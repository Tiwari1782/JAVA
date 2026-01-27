public class OverLoadMath {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Demonstrating method/function overloading
        System.out.println("Addition of two integers : " + add(1, 2));
        System.out.println("Addition of three integers : " + add(1, 2, 4));
        System.out.println("Addition of two double : " + add(1.43, 2.78));

        // Demonstrating MATH class methods
        System.out.println("Maximum of 15 and 25 is : " + Math.max(15, 25));
        System.out.println("Minimum of 15 and 25 is : " + Math.min(15, 25));
        System.out.println("Square root of 81 is : " + Math.sqrt(81));
        System.out.println("Power of (3^3)" + Math.pow(3, 3));
        System.out.println("Absolute value of -50 is : " + Math.abs(-50));
        System.out.println("Cube root of 81 is : "+Math.cbrt(81));
    }
}
