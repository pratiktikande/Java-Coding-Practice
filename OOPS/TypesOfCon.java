package OOPS;

public class TypesOfCon {
    public static void main(String[] args) {
        Students s1 = new Students();
        Students s2 = new Students("Pratik");

    }
}

class Students {
    String name;
    int roll;

    Students() {
        System.out.println("Default Or NON para Cons");

    }

    Students(String name) {
        this.name = name;
        System.out.println("Parameterized Constructor");
    }

}