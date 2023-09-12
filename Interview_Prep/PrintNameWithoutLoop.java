package Interview_Prep;


public class PrintNameWithoutLoop {
    public static void printName(int n) {
        if (n > 0) {
            System.out.println("Pratik");
            printName(n - 1); 
        }
    }

    public static void main(String[] args) {
        printName(100);
    }
}
