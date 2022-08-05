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
        // if the there are no webpages to go back return null
        if (back.isEmpty())
            return null;
        // should push the current page into the forward stack
        // should pop the latest value from back stack and update it as the current page
        forward.push(currentPage);
        currentPage = back.pop();
        return currentPage;
    }

    public String forward() {
        // if the there are no webpages to go forward to return null
        if (forward.isEmpty())
            return null;
        // should push the current page into the back stack
        // should pop the latest value from forward stack and update it as the current page
        back.push(currentPage);
        currentPage = forward.pop();
        return currentPage;
    }

    public String visit(String page) {
        //   if currentpage is null then don't push anything to the back
        // go to page should empty the forward stack
        // push the current page to the back stack
        // update the current page to the new page
        forward = new LinkedStack<>(); //adding a new empty linked list
        if (currentPage != null) {
            back.push(currentPage);
        }
        currentPage = page;
        return currentPage;
    }

    public String checkPreviousWebPage() {
        // should return the top most value in the back stack
        return back.top();
    }

    public String checkNextWebPage() {
        // should return the top most value in the forward stack
        return forward.top();
    }

}
