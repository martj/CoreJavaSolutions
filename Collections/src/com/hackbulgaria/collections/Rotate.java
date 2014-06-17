package com.hackbulgaria.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Rotate {
    public ArrayList<Integer> rotate (Collection<Integer> collection, int rotateStep){
       int size = collection.size();
       ArrayList<Integer> list = new ArrayList<Integer>(collection);
      for(int i = 0; i < rotateStep; i++){
          list.add(0, list.get(size-1));
          list.remove(size);
      }
      return list;
    }
    
}
