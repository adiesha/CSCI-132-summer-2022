package org.csci132.summer.week1.lecture1;

import java.util.ArrayList;

/**
 * @author : Adiesha
 * @created : 6/25/2022, Saturday
 **/
public class UnboxingDemo {
    public static void main(String[] args) {
        Integer a = new Integer(45);
        Boolean b = new Boolean(false);

        // These constructors are deprecated. use the factory methods

        Integer j = Integer.valueOf(45);
        Boolean d = Boolean.valueOf(false);
        //ArrayList<Integer> ints = new ArrayList<Integer>();

        int temp1 = j; // Automatic Unboxing
        int temp2 = 12 + j; // Automatic Unboxing
        j = 45; // Automatic Boxing
    }
}
