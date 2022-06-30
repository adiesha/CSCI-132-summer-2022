package org.csci132.summer.week1.lecture2;

public class DemoLoops {
    public static void main(String[] args) {


        double[] doubles = {10.1, 23.56, 67.45, 34.56, 34.89, 36.89, 98.78, 45.78, 45.08, 94.6};
        System.out.println(doubles.length);

        for (int i = 0; i < doubles.length; i++) {
            System.out.println(doubles[i]);
        }
        System.out.println("+++++++++++++++++++++");
        int i = 0;
        while (i < doubles.length) {
            System.out.println(doubles[i]);
            i++;
        }
        System.out.println("+++++++++++++++++++++");
        for (double value : doubles) {
            System.out.println(value);
        }

        System.out.println("-------------------");
        for (int j = doubles.length - 1; j >= 0; j--) {
            System.out.println(doubles[j]);
        }

        System.out.println("$$$$$$$$$$$$$$$$");

        double sum = 0;
        for (double value : doubles) {
            sum += value;
        }
        System.out.println(sum / doubles.length);

        System.out.println("^^^^^^^^^^^^^^^^^");
        sum = 0;
        for (int j = 0; j < doubles.length; j++) {
            if (j % 2 == 0)
                sum += doubles[j];
        }
        System.out.println("Sum of even indexed elements is " + sum);


    }
}
