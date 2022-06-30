package org.csci132.summer.week1.lecture3;

/**
 * @author : Adiesha
 * @created : 6/30/2022, Thursday
 **/
public class Calculator {


    public int multiply(int a, int b) {
        return a + b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double abs(double a) {
//        if (a < 0) {
//            return -a;
//        } else {
//            return a;
//        }

        return a < 0 ? -a : a;
    }


    public boolean isGreaterThan(int a, int b) {
        return a > b;
    }
}
