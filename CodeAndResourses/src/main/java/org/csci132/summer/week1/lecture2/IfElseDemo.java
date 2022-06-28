package org.csci132.summer.week1.lecture2;

/**
 * @author : Adiesha
 * @created : 6/28/2022, Tuesday
 **/
public class IfElseDemo {

    public static void main(String[] args) {
        Door frontDoor = new Door(false, false);


        if (!frontDoor.isOpen()) {
            System.out.println("Door is closed");
            if (frontDoor.isLocked()) {
                System.out.println("Door is unlocking");
                frontDoor.unlock();
            } else {
                System.out.println("Door is Unlocked, continue to open the door");
            }

            frontDoor.open();
            System.out.println("Door opened");
        } else {
            System.out.println("Door is open");
        }

    }
}
