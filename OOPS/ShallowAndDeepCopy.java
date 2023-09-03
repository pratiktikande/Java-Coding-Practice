package OOPS;

public class ShallowAndDeepCopy {
    public static void main(String[] args) {
        Studentt s1 = new Studentt();
        s1.name = "pratik";
        s1.roll = 12;
        s1.password = "vhsdhc";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Studentt s2 = new Studentt(s1);
        s2.password = "xyc";
        s1.marks[2] = 100;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }

}

class Studentt {
    String name;
    int roll;
    String password;
    int marks[];

    // //Shallow Copy Constructor
    // Studentt(Student s1){
    // marks = new int[3];
    // this.name=s1.name;
    // this.roll=s1.roll;
    // this.marks =s1.marks;
    // }

    // Deep Copy Constructor
    Studentt(Studentt s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }

    }

    Studentt() {
        marks = new int[3];
        System.out.println("Constructor is called");
    }
}

//www.github.com/pratiktikande
//@Pratik Tikande