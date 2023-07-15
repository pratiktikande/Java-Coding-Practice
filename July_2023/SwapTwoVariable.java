package July_2023;

public class SwapTwoVariable {
    public static void Swap(int a,int b){
        //Create Local Varible Temp
        int temp=a;
        a=b;
       b=temp;
         System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        Swap(10, 20);
    }
}
