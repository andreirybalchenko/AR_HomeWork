package com.source.it.lecture2.homework;

public class ClockAngel {
    public static void main(String[] args) {
        int hours = 2;
        int mins = 30;
        int result = 0;

        /*Your code here*/
       if (hours <= 6 & mins <= 30) {
           result = 360 - (360/12*hours + 360/60*mins);
       } else {
           result = 360/12*hours - 360/60*mins;
       }
        System.out.println("Angle between hours and minute narrows is " + Math.abs(result));
    }
}
