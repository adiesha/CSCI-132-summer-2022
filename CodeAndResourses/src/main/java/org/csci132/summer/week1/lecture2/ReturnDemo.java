package org.csci132.summer.week1.lecture2;

import java.util.Random;

/**
 * @author : Adiesha
 * @created : 6/28/2022, Tuesday
 **/
public class ReturnDemo {
    public static void main(String[] args) {
        double v = -19.23;
        double d = abs(v);
        System.out.println(d);
    }

    public static double abs(double value) {
        if (value < 0) {
            return -value;
        }
        return value;
    }
}
