
abstract class shape {

   public abstract void draw();

    // Concrete method
    public void displayArea() {
        System.out.println("Area calculation not implemented.");
    }
    
}
/**
 *  circle
 */
class circle extends shape{
     private double radius;

    // Constructor
    public circle(double radius) {
        this.radius = radius;
    }

    // Implementation of the abstract method
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
    
}
interface Sound {
    // Abstract method (no implementation)
    void makeSound();
}

// Concrete class implementing the interface
class Dog implements Sound {
    // Implementation of the interface method
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        shape c1 =new circle(5.0);
        c1.draw();
        c1.displayArea();

        Sound c2 = new Dog();
        c2.makeSound();

    }
    
}
