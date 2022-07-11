package org.csci132.summer.week3.lecture1;

/**
 * @author : Adiesha
 * @created : 7/11/2022, Monday
 **/
public class ExceptionDemo {
    public static void main(String[] args) {

        method1ForException();


        System.out.println(args[0]);
        final int DEFAULT = 1001;
        int n = DEFAULT;
        try {
            n = Integer.parseInt(args[0]);
            if (n <= 0) {
                System.out.println("n must be positive. Using default.");
                n = DEFAULT;

            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No argument specified for n. Using default.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid integer argument. Using default.");
        }
    }

    public static void method1ForException() {
        int[] ints = {1, 23, 34, 5, 5, 6, 7, 566, 7, 6};
        // Trying to access ints.length (which is out of bound)
        System.out.println(ints[ints.length]);
    }
}
