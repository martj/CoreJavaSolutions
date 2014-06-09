package com.corejava.examples.oopfun;

public class Pair {

    public boolean pair(Object first, Object second) {
        if (first.getClass().equals(second.getClass())) {
            return true;
        }
        return false;
    }

    public boolean equals(Object first, Object second) {
        if (pair(first, second)){
            if(first.toString().equalsIgnoreCase(second.toString())){
                return true;
            }
        }
        return false;
    }
}
