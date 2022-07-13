package org.csci132.summer.week3.lecture2;

/**
 * @author : Adiesha
 * @created : 7/12/2022, Tuesday
 **/
public class StaticClassDemo {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass innerClass = outer.new InnerClass();

        OuterClass.StaticNestedClass staticNestedClass = new OuterClass.StaticNestedClass();
        staticNestedClass.accessMembers(outer);
    }
}
