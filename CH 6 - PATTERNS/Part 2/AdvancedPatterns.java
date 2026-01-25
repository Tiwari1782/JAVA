import java.util.*;

public class AdvancedPatterns {

    // Hollow Rectangle
    public static void HollowRectangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int totrows = sc.nextInt();
        System.out.print("Enter cols : ");
        int totcols = sc.nextInt();
        for (int i = 1; i <= totrows; i++) {
            for (int j = 1; j <= totcols; j++) {
                if (i == 1 || i == totrows || j == 1 || j == totcols) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }

    // Inverted and Rotated Half-Pyramid
    public static void HalfPyramid() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }

    // Inverted Half Pyramid with Numbers
    public static void numpyramid() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    // Floyd's Triangle
    public static void floydstriangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
        sc.close();
    }

    // Zero-One Triangle
    public static void ZeroOne() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        sc.close();
    }

    // ButterFly Pattern
    public static void ButterFly() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        // 1st half
        for (int i = 1; i <= n; i++) {
            // Stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces - 2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd Half
        for (int i = n; i >= 1; i--) {
            // Stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces - 2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }

    // Solid Rhombus
    public static void Rhombus() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }

    // Hollow Rhombus
    public static void hollowRhombus() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // Hollow rectangle
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }

    // Diamond Pattern
    public static void Diamond() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 1; j <= (2 * (i - 1) + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Inversion
        for (int i = n; i >= 1; i--) {
            // Spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 1; j <= (2 * (i - 1) + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // HollowRectangle();
        // HalfPyramid();
        // numpyramid();
        // floydstriangle();
        // ZeroOne();
        // ButterFly();
        // Rhombus();
        // hollowRhombus();
        Diamond();
        sc.close();
    }
}
