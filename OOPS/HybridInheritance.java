package OOPS;

public class HybridInheritance {
    public static void main(String[] args) {
        //Hybrid Inheritance can access all the properties and methods from any parent class
        Cat cat = new Cat();
        cat.Breaths();
        cat.walk();
        cat.Sound();
        cat.Eats();
    }
    
}


// Parent class
class Animal1 {
    String color;

    void Eats() {
        System.out.println("Eating");
    }

    void Breaths() {
        System.out.println("Breath");
    }
}

class Fish1 extends Animal1{
    void swim(){
        System.out.println("Swim");
    }
}

class Tuna extends Fish1{
    void speed(){
        System.out.println("fast");
    }
}

class Shark extends Fish1{
    void Size(){
        System.out.println("Large");
    }
}

class Bird1 extends Animal1{
    void fly(){
        System.out.println("Fly");
    }
}

class Peacock extends Bird1{
    void Color(){
        System.out.println("Green");
    }
}



class Mamal1 extends Animal1{
    void walk(){
        System.out.println("Walk");
    }
}

class Dog extends Mamal1{
    void SoundD(){
        System.out.println(" Barking");
    }
}

class Cat extends Mamal1{
    void Sound(){
        System.out.println("Mew mew");
    }
}

class Human extends Mamal1{
    void Run(){
        System.out.println("Running");
    }
}