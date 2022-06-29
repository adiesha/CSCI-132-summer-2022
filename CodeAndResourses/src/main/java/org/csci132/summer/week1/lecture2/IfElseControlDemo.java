package org.csci132.summer.week1.lecture2;

/**
 * @author : Adiesha
 * @created : 6/29/2022, Wednesday
 **/
public class IfElseControlDemo {
    public static void main(String[] args) {
        int k = 11;

        if (k < 10) {
            System.out.println("K is less than 10");
        } else {
            System.out.println("K is not less than 10");
        }


        int j = 77;

        if (j < 50) {
            System.out.println("j is less than 50");
        } else if (j < 85) {
            System.out.println("j is less than 85");
        } else {
            System.out.println("j is not less than 85");
        }
    }
}
