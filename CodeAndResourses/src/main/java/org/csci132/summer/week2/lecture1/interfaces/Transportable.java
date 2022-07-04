package org.csci132.summer.week2.lecture1.interfaces;

/**
 * @author : Adiesha
 * @created : 7/4/2022, Monday
 **/

/**
 * Interface for objects that can be transported.
 */
public interface Transportable {
    /**
     * Returns the weight in grams.
     */
    public int weight();

    /**
     * Returns whether the object is hazardous.
     */
    public boolean isHazardous();
}