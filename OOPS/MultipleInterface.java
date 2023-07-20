package OOPS;

public class MultipleInterface {
    public static void main(String[] args) {
        //Creating Object
        Beer b1= new Beer();
        b1.Meat();
        b1.eat();
    }
}

//Interfaces

interface NonMeatAnimal {
    void eat();
}

interface MeatAnimal {
    void Meat();
}

//Multiple Inheritance In Single Class
class Beer implements NonMeatAnimal, MeatAnimal {
    public void eat(){
        System.out.println("Vegitrian animal");        
    }
    public void Meat() {
      System.out.println("Non Veg Animal");
    }
}
