package DSA.ArrayLists;

import java.util.ArrayList;

public class SizeOfArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(2,44);
        list.add(4);
        list.add(5);

        //To Get Size of Array List
        System.out.println(list.size());

        //To Print Array list Using Loop
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();
    }
}
