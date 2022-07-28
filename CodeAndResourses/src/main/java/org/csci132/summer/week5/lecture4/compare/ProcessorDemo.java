package org.csci132.summer.week5.lecture4.compare;

/**
 * @author : Adiesha
 * @created : 7/25/2022, Monday
 **/
public class ProcessorDemo {
    public static void main(String[] args) {
        Processor processor1 = new Processor(1000, 2000);
        Processor processor2 = new Processor(900, 1500);
        Processor processor3 = new Processor(3200, 3000);
        Processor processor4 = new Processor(4000, 1800);
        Processor processor5 = new Processor(800, 300);

        ProcessorPriceComparator processorPriceComparator = new ProcessorPriceComparator();
        ProcessorSpeedComparator processorSpeedComparator = new ProcessorSpeedComparator();

        System.out.println(processorPriceComparator.compare(processor1, processor3));
        System.out.println(processorPriceComparator.compare(processor2, processor4));
        System.out.println(processorPriceComparator.compare(processor4, processor5));

        System.out.println(processorSpeedComparator.compare(processor1, processor3));
        System.out.println(processorSpeedComparator.compare(processor2, processor4));
        System.out.println(processorSpeedComparator.compare(processor4, processor5));

    }
}
