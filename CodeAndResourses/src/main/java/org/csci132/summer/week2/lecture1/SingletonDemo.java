package org.csci132.summer.week2.lecture1;

/**
 * @author : Adiesha
 * @created : 7/1/2022, Friday
 **/
public class SingletonDemo {
    public static void main(String[] args) {
        Object database = DatabaseConnection.getInstance();
        // add or remove data using database object
    }
}
