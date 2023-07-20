package OOPS;

public class AbstractConstructor {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        // Mustang myhorse=new Mustang();
        //Animal --> Horse --> Mustang

    }
}

//Abstract Class
abstract class Animal3{
    String color;

    //Constructor
    Animal3(){
        System.out.println("ANimal Constructor");
    }

    void eat(){
        System.out.println("Animal Eats");
    }
    abstract void walk();
} 

class Horse extends Animal3{
    Horse(){
        System.out.println("Horse Constructor called");
    }
    void changecolor(){
        color="Black";
    }
    void walk(){
        System.out.println("Horse Runing");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang Constructor called");
    }
class Chicken extends Animal3{
    void changecolor(){
        color="Yellow";
    }
    void walk(){
        System.out.println("Walk On 2 Legs");
    }
}
}


