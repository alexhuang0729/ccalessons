package java;

import java.util.ArrayList;

public class Day4 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(1.0);
        list.add(2.0);
        list.add(3.0);
        // How to add elements

        System.out.println(list.get(0));
        // Equivalent to arr[0]

        System.out.println(list.size());
        // Gets the size of the list (3)

        list.remove(1);
        // 3.0 moves into the 1st index (2nd place)

        System.out.println(list.size());
        System.out.println(list.get(1));
        // Predict the result of these two actions!

        System.out.println(list.contains(5.0));
        // returns a boolean true/false value of whether 5.0 is in the list
    }
}