package org.csci132.summer.week3.lecture1;

import org.csci132.summer.week1.lecture2.Apple;

import java.util.Arrays;
import java.util.Random;

/**
 * Program showing some array uses.
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[] data = new int[10];
        Random rand = new Random(); // a pseudo-random number generator
        rand.setSeed(System.currentTimeMillis()); // use current time as a seed
        // fill the data array with pseudo-random numbers from 0 to 99, inclusive
        for (int i = 0; i < data.length; i++)
            data[i] = rand.nextInt(100); // the next pseudo-random number
        int[] orig = Arrays.copyOf(data, data.length); // make a copy of the data array
        System.out.println("arrays equal before sort: " + Arrays.equals(data, orig));
        Arrays.sort(data); // sorting the data array (orig is unchanged)
        System.out.println("arrays equal after sort: " + Arrays.equals(data, orig));
        System.out.println("orig = " + Arrays.toString(orig));
        System.out.println("data = " + Arrays.toString(data));


        int[] ints1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] ints2 = {1, 2, 3, 4, 5, 6, 8, 7};
        System.out.println(Arrays.equals(ints1, ints2));

        // fill (Not good for filling object arrays)
        Apple[] apples = new Apple[10];
        System.out.println(Arrays.toString(apples));
        Arrays.fill(apples, new Apple("Red", "REDAPPLE"));
        System.out.println(Arrays.toString(apples));

        int[] intsfill = new int[10];
        System.out.println(Arrays.toString(intsfill));
        Arrays.fill(intsfill, 1);
        System.out.println(Arrays.toString(intsfill));

        int[] intssort = {10, 34, 45, 56, 3, 0, 67, -1};
        System.out.println(Arrays.toString(intssort));
        Arrays.sort(intssort);
        System.out.println(Arrays.toString(intssort));

        int[][] multiints = new int[10][8];
        for (int i = 0; i < multiints.length; i++) {
            for (int j = 0; j < multiints[0].length; j++) {
                multiints[i][j] = rand.nextInt(100);
            }
        }
        System.out.println("================================");

        for (int i = 0; i < multiints.length; i++) {
            for (int j = 0; j < multiints[0].length; j++) {
                System.out.print(multiints[i][j] + "\t");
            }
            System.out.println();
        }
    }

}