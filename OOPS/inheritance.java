package OOPS;

public class Inheritance {
    public static void main(String[] args) {
        // Create Object Of Derived class
        Fish luna = new Fish();
        luna.Eat();
        luna.Breath();

    }
}

// Parent class
class Animal {
    String color;

    void Eat() {
        System.out.println("Eating");
    }

    void Breath() {
        System.out.println("Breath");
    }
}

// Sub class or Derived Classs
class Fish extends Animal {
    // Extends Key word use to inhert parent class
    int Fins;

    void Swim() {
        System.out.println(" Swiming");
    }

    void Deep() {
        System.out.println("Going Deep");
    }
}
