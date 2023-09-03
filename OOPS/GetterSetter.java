package OOPS;

public class GetterSetter {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());

    }
}

class Pen {
    private String color;
    private int tip;

    //getter
    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    //setter
    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}
//www.github.com/pratiktikande
//@Pratik Tikande