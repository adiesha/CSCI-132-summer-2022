package com.csci132.lab1;

/**
 * @author : Adiesha
 * @created : 7/5/2022, Tuesday
 **/
public class LoopDemo {
    public static void main(String[] args) {
        int[] array = {20, 34, 54, 100, -1, 34, 20, 23, 89, 45, 45, 99, 121, 343};

        // find the max value in the array
        int max = Integer.MIN_VALUE;
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }

        System.out.println("Max value in the array is: " + max);

        // finding the min value
        int min = Integer.MAX_VALUE;
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }

        System.out.println("Min value in the array is: " + min);

        // finding the average of the array
        int sum = 0;
        for (int value : array) {
            sum += value;
        }

        System.out.println("Average of the array is: " + sum * 1.0 / array.length); // since average can be a double, we have to multiply sum with 1.0 to make it a double value

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }

    }
}
