package com.corejava.examples.oopfun;

public class StackImpl {
    Node[] stack = new Node[8];
    private int counter = 0;

    /* Constructor */

    /* Functions */
    public void pushElem(Object element) {
        stack[getCounter()] = new Node(element, getCounter());
        setCounter(getCounter() + 1);
    }

    public void popElem() {

    }

    public int lenght() {
        return getCounter();
    }

    public void clearStack() {

    }

    public boolean  isEmpty() {
        if(stack[0] == null){
        return true;    
        }
        return false;
    }

    /* Getters and setters */
    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    /* Start class node */
    public class Node {
        private int position;
        private Object node;

        public Node(Object obj, int position) {
            this.node = obj;
            this.position = position;
        }

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }

        public Object getNode() {
            return node;
        }

        public void setNode(Object node) {
            this.node = node;
        }
    }
    /* End class node */
}
