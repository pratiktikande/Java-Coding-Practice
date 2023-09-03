package Classes_and_Object_Programs;

// Abstract class definition
abstract class Shape {
    // Abstract method (no implementation)
    public abstract double calculateArea();

    // Concrete method
    public void display() {
        System.out.println("This is a shape.");
    }
}

// Concrete subclass of the abstract class
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Concrete subclass of the abstract class
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

public class AbstractClass{
    public static void main(String[] args) {
        // Cannot create an object of an abstract class
        // Shape myShape = new Shape(); // This line will cause an error

        // However, you can create objects of its concrete subclasses
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 3.0);

        // Using polymorphism to call the calculateArea method of Circle
        System.out.println("Area of Circle: " + circle.calculateArea());

        // Using polymorphism to call the calculateArea method of Rectangle
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());

        // Using the display method from the abstract class
        circle.display();
        rectangle.display();
    }
}

//www.github.com/pratiktikande
//@Pratik Tikande