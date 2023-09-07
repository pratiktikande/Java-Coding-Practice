package TCS.ARRAYS;

import java.util.Arrays;

public class SmallestAndSecondSmallest {
    public static void findSmallestAndSecondSmallest(int num[]){
        Arrays.sort(num);
            System.out.println(num[0]);
            System.out.println(num[1]);
    }
    public static void main(String[] args) {
        int num []={1,5,6,4,7,8};
        findSmallestAndSecondSmallest(num);
    }
}
