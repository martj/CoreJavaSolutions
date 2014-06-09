package com.corejava.examples.oopfun;

public class Time {
    private String time;
    private String date;
    public Time(String time, String date){
        this.time = time;
        this.date = date;
    }
    
    @Override
    public String toString() {
         StringBuilder temp = new StringBuilder();
         temp.append(time);
         temp.append(date);
         
         return temp.toString();
    }
  //  Implement the toString() method, returning the time and date in format : "hh:mm:ss dd.MM.YY". 
    
    public String getTime(){
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
}
