package org.csci132.summer.week1.lecture2;

import org.csci132.summer.week1.lecture1.Day;

/**
 * @author : Adiesha
 * @created : 6/28/2022, Tuesday
 **/
public class SwitchDemo {

    public static void main(String[] args) {
        Day today = Day.WED;

        switch (today) {
            case MON:
                System.out.println("This is tough");
                break;
            case TUE:
                System.out.println("This is getting better.");
                break;
            case WED:
                System.out.println("Half way there.");
                break;
            case THU:
                System.out.println("I can see the light.");
                break;
            case FRI:
                System.out.println("Now we are talking.");
                break;
            default:
                System.out.println("Day off!");

        }
    }
}
