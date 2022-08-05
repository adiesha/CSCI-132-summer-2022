package org.csci132.labs;

/**
 * @author : Adiesha
 * @created : 7/27/2022, Wednesday
 **/
public class Fibonacci {

    public static int fibonacci(int n) {
        // This method should return the value of nth fibonacci number
        // You have to implement this using recursion
        // Fib - 0, 1, 1, 2, 3, 5, 8, 13, 21 ....
        // Fib_{i} = Fib_{i-1} + Fib_{i-2}
        if (n < 1) {
            throw new IllegalStateException("Not defined for n < 1");
        } else if (n < 3) {
            return n - 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }


}
