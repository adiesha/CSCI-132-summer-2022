package org.csci132.summer.week3.lecture2;

/**
 * @author : Adiesha
 * @created : 7/12/2022, Tuesday
 **/
public class OuterClass {
    String outerField = "Outer field";
    static String staticOuterField = "Static outer field";
    public class InnerClass {
        public void method() {
            System.out.println("method");
            System.out.println(outerField);
            System.out.println(staticOuterField);
        }
    }

    static class StaticNestedClass {
        void accessMembers(OuterClass outer) {
            // Compiler error: Cannot make a static reference to the non-static
            //     field outerField
            // System.out.println(outerField);
            System.out.println(outer.outerField);
            System.out.println(staticOuterField);
        }
    }
}
