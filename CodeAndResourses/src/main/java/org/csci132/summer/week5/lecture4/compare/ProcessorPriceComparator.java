package org.csci132.summer.week5.lecture4.compare;

import java.util.Comparator;

/**
 * @author : Adiesha
 * @created : 7/25/2022, Monday
 **/
public class ProcessorPriceComparator implements Comparator<Processor> {
    @Override
    public int compare(Processor o1, Processor o2) {
        return o1.price - o2.price;
    }

}
