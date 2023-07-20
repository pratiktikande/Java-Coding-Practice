package OOPS;

public class FunctionOverloading {
    public static void main(String[] args) {
        Calculate cal = new Calculate();
        System.out.println(cal.sum(5, 6));
        System.out.println(cal.sum((float) 1.5, (float) 2.5));
        System.out.println(cal.sum(1, 2, 3));

    }
}

class Calculate {

    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}
