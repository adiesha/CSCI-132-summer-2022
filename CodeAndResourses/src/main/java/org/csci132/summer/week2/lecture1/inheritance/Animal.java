package org.csci132.summer.week2.lecture1.inheritance;

/**
 * @author : Adiesha
 * @created : 7/4/2022, Monday
 **/
public class Animal {

    private String name;
    private String scientificid;

    public Animal(String name, String scientificid) {
        this.name = name;
        this.scientificid = scientificid;
    }

    public String makeSound() {
        return String.format("%s makes sound", this.name);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScientificid() {
        return scientificid;
    }

    public void setScientificid(String scientificid) {
        this.scientificid = scientificid;
    }


}
