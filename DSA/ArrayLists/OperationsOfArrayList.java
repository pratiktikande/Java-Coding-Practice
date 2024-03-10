package DSA.ArrayLists;

import java.util.ArrayList;

public class OperationsOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        //Add Element
        System.out.println("Add Element");
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.print(list);
        System.out.println();


        //Get Element 
        System.out.println("Get element Operation");
       int element=  list.get(1);
        System.out.println(element);
        System.out.println();

        //Remove element 
        System.out.println("Remove element Operation");
        list.remove(3);
        System.out.println(list);
        System.out.println();

        //set element
        System.out.println("Set element Operation");
        list.set(2,11);
        System.out.println(list);
        System.out.println();


        //Contains Element
        System.out.println("check contains element operation");
        System.out.println(list.contains(4));
        System.out.println(list.contains(8));
        System.out.println();

    }
    
}
