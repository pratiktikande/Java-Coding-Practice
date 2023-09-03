package July_2023;

public class AnotherHardestPatternEver {
    public static void main(String[] args) {
        int size = 7;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size * 4; j++) {
                if (j <= i) {
                    System.out.print(j);
                } else if (j <= size * 2 - i) {
                    System.out.print(" ");
                } else if (j <= size * 2) {
                    System.out.print(size * 2 - j + 1);
                } else if (j <= size * 2 + i) {
                    System.out.print(" ");
                } else if (j <= size * 4 - i + 1) {
                    System.out.print(j - size * 2);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
//www.github.com/pratiktikande
//@Pratik Tikande
