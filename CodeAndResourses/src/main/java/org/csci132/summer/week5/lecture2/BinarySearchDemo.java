package org.csci132.summer.week5.lecture2;

/**
 * @author : Adiesha
 * @created : 7/24/2022, Sunday
 **/
public class BinarySearchDemo {
    public static void main(String[] args) {
        int[] a = {2, 53, 5, 7, 3, -56, 4, 67, 10, 1, 0, 76};
        System.out.println(BinarySearch.binarySearch(a, 76, 0, a.length - 1));
        System.out.println(BinarySearch.binarySearch(a, 23, 0, a.length - 1));
        System.out.println(BinarySearch.binarySearch(a, 42, 0, a.length - 1));
    }
}
