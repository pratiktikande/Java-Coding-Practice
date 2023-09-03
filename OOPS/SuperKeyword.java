package OOPS;

public class SuperKeyword {
    public static void main(String[] args) {
        Horse3 horse3= new Horse3();
        System.out.println(horse3.color);

    }
    
}
class Animal4{
    String color;
    Animal4(){
        System.out.println("ANimal Constructor is called");
    }
}

class Horse3 extends Animal4{
    Horse3(){
        //Super Immediate Print class
        //Super Keyword used to refer parent class Object
        super();
        super.color="Brown";
        System.out.println("Horse COnstructor Is called");
    }
}

//www.github.com/pratiktikande
//@Pratik Tikande