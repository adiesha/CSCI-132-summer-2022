package org.csci132.summer.week1.lecture2;

import java.util.Scanner;

/**
 * @author : Adiesha
 * @created : 6/28/2022, Tuesday
 **/
public class InputDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age in years: ");
        double age = input.nextDouble();
        System.out.print("Enter your maximum heart rate: ");
        double rate = input.nextDouble();
        double fb = (rate - age) * 0.65;
        System.out.println("Your ideal fat-burning heart rate is " + fb);
        System.out.println("Enter a natural number");
        int number = input.nextInt();
        System.out.println("natural number input is: " + number);

    }
}

