package org.csci132.summer.week2.lecture1.interfaces;

/**
 * @author : Adiesha
 * @created : 7/4/2022, Monday
 **/
public class Photograph implements Sellable {

    private String descript; // description of this photo
    private int price; // the price we are setting
    private boolean color; // true if photo is in color


    public String description() {
        return descript;
    }


    public int listPrice() {
        return price;
    }


    public int lowestPrice() {
        return price / 2;
    }

    public boolean isColor() {
        return color;
    }
}
