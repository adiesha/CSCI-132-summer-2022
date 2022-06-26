package org.csci132.summer.week1.lecture1;

/**
 * @author : Adiesha
 * @created : 6/25/2022, Saturday
 **/
public class ArrayDemo {

    public static void main(String[] args) {
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29}; // literal assignment

        int[] upto10 = new int[10]; // creates an array with 10 elements
        // elements in the array are initailzed to zero

        for (int comp : upto10) {
            System.out.println(comp);
        }


        System.out.println("======================");
        for (int i = 0; i < 10; i++) {
            upto10[i] = i;
        }

        for (int comp : upto10) {
            System.out.println(comp);
        }

    }
}
