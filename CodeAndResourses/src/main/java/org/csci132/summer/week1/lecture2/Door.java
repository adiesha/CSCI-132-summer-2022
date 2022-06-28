package org.csci132.summer.week1.lecture2;

/**
 * @author : Adiesha
 * @created : 6/28/2022, Tuesday
 **/
public class Door {
    private boolean locked = false;
    private boolean isOpen = false;

    public Door() {
        this.locked = true;
        this.isOpen = false;
    }

    public Door(boolean open, boolean locked) {
        this.isOpen = open;
        this.locked = locked;
    }

    public boolean isOpen() {
        return this.isOpen;
    }

    public boolean isLocked() {
        return this.locked;
    }

    public void open() {
        this.isOpen = true;
    }

    public void close() {
        this.isOpen = false;
    }

    public void unlock() {
        this.locked = false;
    }

    public void lock() {
        this.locked = true;
    }
}
