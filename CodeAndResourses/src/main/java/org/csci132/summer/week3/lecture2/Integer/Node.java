package org.csci132.summer.week3.lecture2.Integer;

public class Node {
        private Integer element;
        private Node next;

        public Node(Integer e, Node next) {
            element = e;
            this.next = next;
        }

        public Integer getElement() {
            return element;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }