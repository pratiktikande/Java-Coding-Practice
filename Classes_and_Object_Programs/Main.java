package Classes_and_Object_Programs;

// Class definition
class MyClass {
    // Fields (or instance variables)
    int number;
    String text;

    // Constructor
    public MyClass(int number, String text) {
        this.number = number;
        this.text = text;
    }

    // Method to display the class fields
    public void display() {
        System.out.println("Number: " + number);
        System.out.println("Text: " + text);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of the MyClass
        MyClass myObject = new MyClass(42, "Hello, World!");

        // Calling the display method of the object
        myObject.display();
    }
}

