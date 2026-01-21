import java.util.*;

// Abstract class
abstract class Student {
    int roll_no;
    String name;
    int marks;

    // Method to take input
    void getData(Scanner sc) {
        System.out.print("Enter Roll Number: ");
        roll_no = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks = sc.nextInt();
    }

    // Method to display data
    void displayData() {
        System.out.println("\nStudent Details:");
        System.out.println("Roll No: " + roll_no);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

// Concrete class
class CollegeStudent extends Student {
    
}

public class exptwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CollegeStudent s1 = new CollegeStudent();
        s1.getData(sc);    
        s1.displayData(); 

        sc.close();
    }
}
