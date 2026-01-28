//Base class
class Animal {
    void breathe() {
        System.out.println("Breathing");
    }
}

//Single level Inheritence
class Penguin extends Animal {
    void eat() {
        System.out.println("Eating");
    }
    
    void swim() {
        System.out.println("Swimming");
    }
}

// Multi level Inheritence 
class BabyPenguin extends Penguin {
   
}

// Hierarchical Inheritance 
class Sparrow extends Animal {
    void eat() {
        System.out.println("Eating");
    }

    void fly() {
        System.out.println("Flying");
    }
}

// Multiple Inheritance
interface Walker {
    void walk();
}

class SmartPenguin implements Walker {
    public void walk() {
        System.out.println("Walking");
    }

    void swim() {
        System.out.println("Swimming");
    }
}

public class InheritanceSimple {
    public static void main(String[] args) {

        // Single Inheritance
        Penguin p = new Penguin();
        p.eat();
        p.swim();

        // Multilevel Inheritance
        BabyPenguin bp = new BabyPenguin();
        bp.breathe();
        bp.eat();
        bp.swim();

        // Hierarchical Inheritance
        Sparrow s = new Sparrow();
        s.eat();
        s.fly();

        // Multiple Inheritance (Interface)
        SmartPenguin sp = new SmartPenguin();
        sp.walk();
        sp.swim();
    }
}