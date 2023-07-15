package July_2023;

public class SwapWithoutTemp {
    public static void WithoutTemp(int a,int b){
        //Withouut Temp Value
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swaping");
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        //Call From main Function
        WithoutTemp(10, 20);
    }
}
