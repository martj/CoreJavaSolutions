package com.hackbulgaria.collections;

import java.util.ArrayList;
import java.util.Collection;

//BoundedQueue<Integer> boundedQueue = new BoundedQueue<>(3);
//boundedQueue.offer(1);
//boundedQueue.offer(2);
//boundedQueue.offer(3);
//boundedQueue.offer(4);
//boundedQueue.offer(5);
//System.out.println(boundedQueue.toString()); //3,4,5

public class BoundedQueue<E> {
    /* ....................................................................... */
    public ArrayList<Integer> rotate(Collection<Integer> collection, int rotateStep) {
        int size = collection.size();
        ArrayList<Integer> list = new ArrayList<Integer>(collection);
        for (int i = 0; i < rotateStep; i++) {
            list.add(0, list.get(size - 1));
            list.remove(size); 
        }
        return list;
    }

    /* ......................................................................... */
    public BoundedQueue(int size) {
    }

    public void offer() {

    }
}