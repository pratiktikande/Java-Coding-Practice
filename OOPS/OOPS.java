package OOPS;

public class OOPS {
    //Class Name Shoild Be always Start From Capital Later
    //Function Name Should be in small letter   

    public static void main(String[] args) {
        Pen p1=new Pen(); //Object Created
        //Class name , object name = keyword Class Name();

        p1.setColor("Blue");
        //call Function
        System.out.println(p1.color);

        p1.setTip(5);
        System.out.println(p1.tip);

        //or
        p1.color="Yellow";
        System.out.println(p1.color);
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percenatge;

    void avgMarks(int phy, int chem, int math) {
        percenatge = (phy + chem + math) / 3;
    }

}