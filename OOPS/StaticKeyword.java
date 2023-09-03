package OOPS;

public class StaticKeyword {
    public static void main(String[] args) {
        Stu s1 = new Stu();
        s1.schoolName = "Vidya Mandir";

        Stu s2 = new Stu();
        System.out.println(s2.schoolName);

        Stu s3 = new Stu();
        s3.schoolName = "KJ";
        System.out.println(s2.schoolName);

    }
}

class Stu {
    String name;
    int roll;

    String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}
//www.github.com/pratiktikande
//@Pratik Tikande