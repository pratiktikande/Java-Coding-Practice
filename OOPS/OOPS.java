package OOPS;

public class Oops {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // Object Created
        p1.setColor("Blue"); // Call method
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());

        // or
        p1.setColor("Yellow");
        System.out.println(p1.getColor());
    }
}

class Pen {
    private String color;
    private int tip;

    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for color
    public void setColor(String newColor) {
        color = newColor;
    }

    // Getter for tip
    public int getTip() {
        return tip;
    }

    // Setter for tip
    public void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void avgMarks(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
    }
}
//www.github.com/pratiktikande
//@Pratik Tikande