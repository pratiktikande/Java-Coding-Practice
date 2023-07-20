package OOPS;

public class Hierachial {
    
    public static void main(String[] args) {
        // // Create Object Of Derived class
        Bird b1 = new Bird();
        b1.Eats();
        b1.Breaths();
        b1.fly();
        
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

//All Derived Or Sub Class Get Extend From The Same Parent class 

class Fish extends Animals{
    void swim(){
        System.out.println("Swim");
    }
}

class Human extends Animals{
    void walk(){
        System.out.println("Walk");
    }
}

class Bird extends Animals{
    void fly(){
        System.out.println("Flying");
    }
}
