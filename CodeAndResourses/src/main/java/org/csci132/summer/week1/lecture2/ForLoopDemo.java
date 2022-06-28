package org.csci132.summer.week1.lecture2;

/**
 * @author : Adiesha
 * @created : 6/28/2022, Tuesday
 **/
public class ForLoopDemo {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("____________________________");

        for (int j = 10; j > 0; j--) {
            System.out.println(j);
        }

        System.out.println("____________________________");

        // for each type loops

        double[] doubles = {1.2, 3.4, 5.4, 23.5, 544.7, 2332.5, 343.5};

        for (int i = 0; i < doubles.length; i++) {
            System.out.println(doubles[i]);
        }
        System.out.println("+++++++++++++");

        for (double value : doubles) {
            System.out.println(value);
        }
    }
}
