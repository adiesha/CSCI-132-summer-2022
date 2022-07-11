package org.csci132.summer.week3.lecture1;

import org.csci132.summer.week1.lecture2.Apple;

/**
 * @author : Adiesha
 * @created : 7/11/2022, Monday
 **/
public class ArraysRevisited {

    public static void main(String[] args) {
        Apple[] apples = new Apple[12]; // creates an array for 12 Apple objects
        // this does not create 12 apple objects
        for (Apple apple :
                apples) {
            System.out.println(apple);
        }

        System.out.println("----------------------------------------");
        // create array of primitive type
        int[] ints = new int[15];
        for (int a : ints) {
            System.out.println(a);
        }

        // Wrapper classes act as objects
        System.out.println("---------------------------------------");
        Integer[] integers = new Integer[15];
        for (int b : integers) {
            System.out.println(b);
        }

    }
}
