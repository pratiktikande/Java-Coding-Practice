package OOPS;

public class MethodOverriding {
    public static void main(String[] args) {
            //Create Object
    Deer deer = new Deer();
    deer.eat();
    //.eat functiion will target Object class Not Parent class even if They Have Same Functions/Methods
    }
    
}

//Parent Class
class Animal2{
    void eat(){
        System.out.println("Eat Any Thing");
    }
}

//child class
class Deer extends Animal2{
    void eat(){
        System.out.println("Eat Grass Only");
    }
}
