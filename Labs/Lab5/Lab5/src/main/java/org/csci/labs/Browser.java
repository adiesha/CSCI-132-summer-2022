package org.csci.labs;

/**
 * @author : Adiesha
 * @created : 7/21/2022, Thursday
 **/
public class Browser {

    // add the stacks needed
    Stack<String> back;
    Stack<String> forward;

    String currentPage;

    public Browser() {
        back = new LinkedStack<>();
        forward = new LinkedStack<>();
    }

    public Browser(String initialPage) {
        this();
        this.currentPage = initialPage;
    }


    public String back() {
        // should push the current page into the forward stack
        // should pop the latest value from back stack and update it as the current page
        return null;
    }

    public String forward() {
        // should push the current page into the back stack
        // should pop the latest value from forward stack and update it as the current page
        return null;
    }

    public String visit(String page) {
        // go to page should empty the forward stack
        // push the current page to the back stack
        // update the current page to the new page
        return null;
    }

    public String checkPreviousWebPage() {
        // should return the top most value in the back stack
        return null;
    }

    public String checkNextWebPage() {
        // should return the top most value in the forward stack
        return null;
    }

}
