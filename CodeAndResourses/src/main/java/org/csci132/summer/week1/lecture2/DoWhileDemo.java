package org.csci132.summer.week1.lecture2;

/**
 * @author : Adiesha
 * @created : 6/28/2022, Tuesday
 **/
public class DoWhileDemo {
    public static void main(String[] args) {
        String input = "csci232";
        do {
            System.out.println("Runnning the body of the loop at least once before checking the boolean expression");
        } while (input == "csci132");
    }
}
