package org.csci132.summer.week2.lecture2;

import java.util.Scanner;

/**
 * @author : Adiesha
 * @created : 7/6/2022, Wednesday
 **/
public class LogicalOperatorsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputvalue = scanner.nextInt();
        int inputvalue2 = scanner.nextInt();
        System.out.println(inputvalue);
        System.out.println(inputvalue2);

        boolean expresion1 = inputvalue > 5;
        boolean expression2 = (inputvalue2 % 10 == 0);

        if (expresion1 && expression2) {
            System.out.println("Inputvalue1 is greater than 5 and inputvalue2 is divisible by 10");
        }

        boolean expression3 = (inputvalue % 3 == 0);
        if (!expression3) {
            System.out.println("inputvalue1 is not divisible by 3");
        }

        if (expresion1 || expression3) {
            System.out.println("Either inputvalue1 is greater than 5 or divisible by 3");
        }


    }
}
