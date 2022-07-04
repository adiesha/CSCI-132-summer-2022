package org.csci132.summer.week2.lecture1.interfaces;

public interface Insurable extends Sellable, Transportable {
    /**
     * Returns insured value in cents
     */
    public int insuredValue();
}