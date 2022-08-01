package org.csci132.summer.week6.lecture1;

import java.util.HashMap;

/**
 * @author : Adiesha
 * @created : 8/1/2022, Monday
 **/
public class JavaHashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();


        stringIntegerHashMap.put("A", 1);
        stringIntegerHashMap.put("B", 3);
        stringIntegerHashMap.put("C", 4);
        stringIntegerHashMap.put("A", 28);
        System.out.println(stringIntegerHashMap.get("B"));
        System.out.println(stringIntegerHashMap.get("A"));

        System.out.println(stringIntegerHashMap.containsKey("M"));
        System.out.println(stringIntegerHashMap.containsKey("B"));

    }
}
