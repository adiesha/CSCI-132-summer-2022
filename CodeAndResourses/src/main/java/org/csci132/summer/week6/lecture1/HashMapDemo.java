package org.csci132.summer.week6.lecture1;

import org.csci132.summer.week1.lecture2.Apple;

import java.util.HashMap;

/**
 * @author : Adiesha
 * @created : 8/1/2022, Monday
 **/
public class HashMapDemo {

    public static void main(String[] args) {
        Map<Integer, String> integerStringMap1 = new UnsortedTableMap<>();
        integerStringMap1.put(1, "one");
        integerStringMap1.put(2, null);

        System.out.println(integerStringMap1.get(1));
        System.out.println(integerStringMap1.get(2));
        System.out.println(integerStringMap1.get(3));

        System.out.println("++++++++++++++++++++++++++++++++++");

    }

}
