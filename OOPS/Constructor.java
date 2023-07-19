package OOPS;

public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.name );
        Student s2 = new Student("Pratik");
        System.out.println(s2.name);
    }
}

class Student{
    String name;
    int roll;

    Student(){
        //Constructor
    }
    Student(String name){
        this.name=name;
    }
}
