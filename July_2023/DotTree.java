package July_2023;

public class DotTree {
    public static void main(String[] args) {
        int treeHeight = 5;

        for (int i = 0; i < treeHeight; i++) {
            for (int j = treeHeight - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i * 2; k++) {
                System.out.print(".");
            }
            System.out.println();
        }

        // Print trunk
        for (int i = 0; i < treeHeight - 1; i++) {
            System.out.print(" ");
        }
        System.out.println("|");
    }
}
