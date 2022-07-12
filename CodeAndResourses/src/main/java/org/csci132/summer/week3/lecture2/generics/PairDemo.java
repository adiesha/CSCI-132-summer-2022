package org.csci132.summer.week3.lecture2.generics;

/**
 * @author : Adiesha
 * @created : 7/12/2022, Tuesday
 **/
public class PairDemo {
    public static void main(String[] args) {
        PairWithObject bid = new PairWithObject("ORCL", 32.041);
        // The first parameter, "ORCL", is a String, and thus also an Object.
        // The second parameter is a double, but it is automatically boxed into a Double,
        // The drawback of the classic approach involves use of the accessors, both of
        // which formally return an Object reference.
        // Even if we know that the first object is
        // a string in our application, we cannot legally make the following assignment

        // String stock = bid.getFirst();  // compile error

        // This represents a narrowing conversion from the declared return type of Object to
        //the variable of type String. Instead, an explicit cast is required, as follows:

        String stock = (String) bid.getFirst();


        // Now let's define the Pair class differently

        Pair<String, Double> bid2 = new Pair<>("ORCL", 23.65);
        // After the new operator, we provide the name of the generic class, then an empty
        //set of angle brackets (known as the “diamond”), and finally the parameters to the
        //constructor.
        Pair<Integer, Double> doublePair = new Pair<Integer, Double>(223, 45.78);

        // this also possible
        Pair<Integer, Double> doublePair2 = new Pair(223, 45.78);

        // Now we can do the following without casting
        String stock2 = bid2.getFirst();


    }
}
