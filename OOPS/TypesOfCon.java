package OOPS;

public class TypesOfCon {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Pratik");
        Student s3 = new Student(12);

    }
}

class Student {

    Student() {
        System.out.println("Default Or NON para Cons");

    }

    Student(String name) {
        System.out.println("Parameterized Constructor");
    }

    Student(int Roll) {
        System.out.println("para Meterized Constructor");
    }
}