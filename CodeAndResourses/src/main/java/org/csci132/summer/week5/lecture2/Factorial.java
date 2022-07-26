package org.csci132.summer.week5.lecture2;

/**
 * @author : Adiesha
 * @created : 7/24/2022, Sunday
 **/
public class Factorial {
    public static int factorial(int n) throws IllegalArgumentException {
        if (n < 0)
            throw new IllegalArgumentException(); // argument must be nonnegative
        else if (n == 0)
            return 1; // base case
        else
            return n * factorial(n - 1); // recursive case
    }
}
