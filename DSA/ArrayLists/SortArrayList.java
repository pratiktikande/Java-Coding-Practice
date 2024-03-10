package DSA.ArrayLists;

import java.util.*;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(47);
        list.add(9);
        list.add(7);
        list.add(15);

        //To Print the orignal arraylist
        System.out.println(list);

        //To Sort The Arrylist
        Collections.sort(list);
        System.out.println(list);

        //To Sort in Reverse Order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
