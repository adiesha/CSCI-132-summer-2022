package org.csci132.summer.week2.lecture1.inheritance;

/**
 * @author : Adiesha
 * @created : 7/4/2022, Monday
 **/
public class InheritanceDemo {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Dog dog2 = new Dog();
        dog2.setNickName("Luna");
        dog = new Animal("Cat", "Felis catus");

        System.out.println(dog.makeSound());
        System.out.println(dog2.makeSound());
        System.out.println(dog.makeSound());

        dog = new Dog();
        System.out.println(dog instanceof Animal);
        System.out.println(dog instanceof Dog);

        System.out.println("----------------------------");

        Animal rabit = new Animal("Rabit", "Oryctolagus cuniculus");
        System.out.println(rabit instanceof Animal);
        System.out.println(rabit instanceof Dog);


    }
}
