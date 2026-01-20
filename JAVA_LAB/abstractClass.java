import java.util.*;

abstract class Shape {
    // Abstract Method
    abstract void draw();

    // Concrete Method
    void message() {
        System.out.println("This is a Shape!!");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Draw Circle!!");
    }
}

public class abstractClass {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.message();
        s.draw();
    }
}
