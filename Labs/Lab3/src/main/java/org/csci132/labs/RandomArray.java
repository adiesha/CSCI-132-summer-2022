package org.csci132.labs;

import java.util.Arrays;
import java.util.Random;

/**
 * @author : Adiesha
 * @created : 7/16/2022, Saturday
 **/
public class RandomArray {

    public static void removeElement(double[] array) {
        Random random = new Random();


        while (true) {
            int size = array.length;
            if (size == 1) {
                break;
            }
            int randIndex = random.nextInt(size);
            int j = 0;
            double[] arrnew = new double[size - 1];
            for (int i = 0; i < array.length; i++) {
                if (i == randIndex) {
                    continue;
                }

                arrnew[j++] = array[i];
            }
            array = arrnew;
            System.out.println(Arrays.toString(array));
        }
    }

    public static void main(String[] args) {
        double[] doubles = {1.0, 5.6, 89.1, 75.1, 3641.6, 1.5, 4655.1, 45.12, 98.12, 145.9, 75.1};
        removeElement(doubles);
    }
}
