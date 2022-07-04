package org.csci132.summer.week2.lecture1;

import javax.xml.crypto.Data;

/**
 * @author : Adiesha
 * @created : 7/1/2022, Friday
 **/
public class DatabaseConnection {

    private static Object database;

    // making the default constructor private
    private DatabaseConnection() {

    }

    public static Object getInstance() {
        if (database == null) {
            //acquire lock for multi threaded application
            database = new Object(); // assign the database object
        }
        return database;
    }

}
