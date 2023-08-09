package July_2023;
public class HardestPatternEver {
    public static void main(String[] args) {
        int size = 9;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size * 4; j++) {
                if (j <= i || j >= size * 2 - i + 1 || (j >= size * 2 && j <= size * 2 + i - 1) || (j >= size * 4 - i + 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
