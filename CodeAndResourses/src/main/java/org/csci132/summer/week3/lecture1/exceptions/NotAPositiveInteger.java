package org.csci132.summer.week3.lecture1.exceptions;

/**
 * @author : Adiesha
 * @created : 7/11/2022, Monday
 **/
public class NotAPositiveInteger extends Exception {
    public NotAPositiveInteger() {
        super("Not a positive Integer");
    }

    @Override
    public String toString() {
        return "Not a positive Integer";
    }
}
