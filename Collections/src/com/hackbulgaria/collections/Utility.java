package com.hackbulgaria.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Utility {
    public String returnReadable(HashMap<? extends Object, ? extends Object> map) {
        StringBuilder temp = new StringBuilder();
        temp.append("{ ");
        
        for (Object key : map.keySet()) {
            map.get(key);
            temp.append(key.toString() + ":" + map.get(key) + ", ");

        }
        temp.append('}');
        return temp.toString();
    }
    public String countEachWords(String string){
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        String[] splited = string.split(" ");
        for (String str : splited) {
            if (map.containsKey(str)){
                map.put(str, map.get(str) + 1);
            }else {
                map.put(str, 1);
            }
        }
        return returnReadable(map);
    }
}
