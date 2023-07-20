package OOPS;

public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c=new Chicken();
        c.eat();
        c.walk();
        
    }
}

//Abstract Class
abstract class Animal3{
    void eat(){
        System.out.println("Animal Eats");
    }
    abstract void walk();
} 

class Horse extends Animal3{
    void walk(){
        System.out.println("Horse Runing");
    }
}
class Chicken extends Animal3{
    void walk(){
        System.out.println("Walk On 2 Legs");
    }
}