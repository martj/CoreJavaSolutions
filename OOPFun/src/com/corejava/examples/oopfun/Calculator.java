package com.corejava.examples.oopfun;

public class Calculator {
    public long calculate(String input) {
        StringBuilder temp = new StringBuilder();
        long tempValue = 0;
        String[] buffer = input.split("");
        for (String string : buffer) {
            if (string.matches("\\d{1}")){ 
                temp.append(string);
                tempValue = Integer.valueOf(temp.toString());
            }else {
                System.out.println(tempValue);
                temp.delete(0, temp.length());
            }
        }
        return 0;
    }
}
