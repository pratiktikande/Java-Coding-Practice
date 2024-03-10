package DSA.ArrayLists;

import java.util.*;

public class ContainerWater {
    public static int conatinWater(ArrayList<Integer> height) {
        int maxWater = 0;

        // Brute Force Approach
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int widht = j - i;
                int currwater = ht * widht;
                maxWater = Math.max(maxWater, currwater);
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(conatinWater(height));

    }
}
