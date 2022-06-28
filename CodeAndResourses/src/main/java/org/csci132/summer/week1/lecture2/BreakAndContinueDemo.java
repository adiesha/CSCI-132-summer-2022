package org.csci132.summer.week1.lecture2;

/**
 * @author : Adiesha
 * @created : 6/28/2022, Tuesday
 **/
public class BreakAndContinueDemo {
    public static void main(String[] args) {
        int j = 0;
        while (j < 10) {
            System.out.println(j);
            if (j == 6) {
                break;
            }
            j = j + 1;
        }


        System.out.println("_______________________");
        int k = 0;
        while (k < 10) {
            if (k == 5) {
                k++;
                continue;
            }
            System.out.println(k);
            k++;


        }

    }
}
