package org.csci132.summer.week2.lecture1.inheritance;

/**
 * @author : Adiesha
 * @created : 7/4/2022, Monday
 **/
public class Dog extends Animal {
    private String nickName;

    public Dog() {
        super("Dog", "Canis lupus familiaris");
    }

    public String makeSound() {
        return String.format("%s barks", nickName == null ? "Dog" : this.nickName);
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
