package OOPS;

public class MultilevelInheritance {
    public static void main(String[] args) {
        // // Create Object Of Derived class
        Dog Tommy = new Dog();
        Tommy.Breaths();
        Tommy.Eats();
        Tommy.legs="4";
        System.out.println(Tommy.legs);

    }
}

// Parent class
class Animals {
    String color;

    void Eats() {
        System.out.println("Eating");
    }

    void Breaths() {
        System.out.println("Breath");
    }
}

//Single level Inheritance
class Mamal extends Animals{
    String legs;
}

//Multi Level Inheritance
class Dog extends Mamal{
    String Bread;
}

//www.github.com/pratiktikande
//@Pratik Tikande