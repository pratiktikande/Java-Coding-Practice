package July_2023;

public class Operatorsinall {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        int c = 10;
        int d = 10;
        int f = 7;

        System.out.println("Declare all The Values Of Varibles");
        System.out.println(" a Is = " + a);
        System.out.println(" b Is = " + b);
        System.out.println(" c Is = " + c);
        System.out.println(" d Is = " + d);
        System.out.println(" f Is = " + f);

        System.out.println(" ");

        // 1) Arithmetic operators
        System.out.println("Arithmetic operators ");

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("");

        System.out.println("Urinary Operator");

        // 2) Urinary Operator

        // Using uniary operators
        System.out.println("Postincrement : " + (c++));

        System.out.println("Preincrement : " + (++c));

        System.out.println("Postdecrement : " + (d--));
        System.out.println("Predecrement : " + (--d));

        System.out.println("");

        System.out.println(" Assignment Operator");

        // 3) Assignment Operator
        System.out.println("f += 3: " + (f += 3));
        System.out.println("f -= 2: " + (f -= 2));
        System.out.println("f *= 4: " + (f *= 4));
        System.out.println("f /= 3: " + (f /= 3));
        System.out.println("f %= 2: " + (f %= 2));
        System.out.println("f &= 0b1010: " + (f &= 0b1010));
        System.out.println("f |= 0b1100: " + (f |= 0b1100));
        System.out.println("f ^= 0b1010: " + (f ^= 0b1010));
        System.out.println("f <<= 2: " + (f <<= 2));
        System.out.println("f >>= 1: " + (f >>= 1));
        System.out.println("f >>>= 1: " + (f >>>= 1));

        System.out.println("");
        System.out.println("Relational Operators");

        // 4) Relational Operators
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == c: " + (a == c));
        System.out.println("a != c: " + (a != c));

        System.out.println("");
        System.out.println("Logical operators");

        // 5) Logical operators
        boolean x = true;
        boolean y = false;

        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        System.out.println("");
        System.out.println("Ternary operator");

        // 6) Ternary operator
        int result = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
        System.out.println("Max of three numbers = " + result);

        System.out.println("");
        System.out.println("Shift Operators");

        // 7) Bitwise Operators
        // Bitwise operators
        int z = 0b1010;
        int u = 0b1100;
        System.out.println("d & e: " + (z & u));
        System.out.println("d | e: " + (z | u));
        System.out.println("d ^ e: " + (z ^ u));
        System.out.println("~d: " + (~z));
        System.out.println("d << 2: " + (z << 2));
        System.out.println("e >> 1: " + (u >> 1));
        System.out.println("e >>> 1: " + (u >>> 1));

        System.out.println("");

        System.out.println("Shift Operators");
        // 8) Shift Operators
        // using left shift
        System.out.println("a<<1 : " + (a << 1));
        // using right shift
        System.out.println("a>>1 : " + (a >> 1));

    }
}

//www.github.com/pratiktikande
//@Pratik Tikande