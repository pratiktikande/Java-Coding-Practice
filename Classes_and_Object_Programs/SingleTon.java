package Classes_and_Object_Programs;

//A Singleton class is a class that allows only one instance of itself to be created throughout the entire application

class Singleton {
    // Private static instance variable to hold the single instance of the class
    private static Singleton instance;

    // Private constructor to prevent outside instantiation
    private Singleton() {
        System.out.println("Singleton instance created.");
    }

    // Public method to get the single instance of the class
    public static Singleton getInstance() {
        // Lazy initialization: Create the instance only when needed
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Other methods and data members of the singleton class can be defined here
    // ...
}

public class SingleTon {
    public static void main(String[] args) {
        // Try to create multiple instances of the Singleton class
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        // The two instances should be the same object, and only one instance should be created
        System.out.println("Are the instances the same? " + (instance1 == instance2));
    }
}


//www.github.com/pratiktikande
//@Pratik Tikande