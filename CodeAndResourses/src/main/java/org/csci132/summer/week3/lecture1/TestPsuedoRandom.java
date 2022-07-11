package org.csci132.summer.week3.lecture1;

import java.util.Random;

/**
 * @author : Adiesha
 * @created : 7/11/2022, Monday
 **/
public class TestPsuedoRandom {
    public static void main(String[] args) {
        Random random = new Random(1001);

        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt());

        }

        // for a given seed the sequence of random numbers will always be the same
        // If we need a different sequence we need to give a different seed value
        // Good practice is to use the System.currentTimeMillis() which outputs the time in milliseconds
        //This method returns the difference, measured in milliseconds, between the current time and midnight,
        // January 1, 1970 UTC(coordinated universal time).
    }
}
