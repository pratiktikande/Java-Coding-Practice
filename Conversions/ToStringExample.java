package Conversions;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Custom toString() implementation
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class ToStringExample {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);

        // Using toString() to get the string representation of objects
        System.out.println("Person 1: " + person1.toString());
        System.out.println("Person 2: " + person2);
    }
}
