package org.csci132.summer.week1.lecture1;

/**
 * @author : Adiesha
 * @created : 6/25/2022, Saturday
 **/
public class CastingDemo {
    public static void main(String[] args) {
        double d1 = 3.2;
        double d2 = 3.9999;
        int i1 = (int) d1;
        int i2 = (int) d2;
        double d3 = (double) i2;

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(d3);

        // You cannot do the following

/*
 *         Double d4 = Double.valueOf(89.12);
 *         int i3 = (int) d4;
 *         int i4 = (Integer) d4;
 */


        int i5 = 42;
        double d4  = i5;  // Widening casting through implicit casting
        //i5 = d1; // Narrow cast through implicit casting: should throw and error at compile tim
    }
}






