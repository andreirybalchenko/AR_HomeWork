package com.source.it.lecture2.homework;

public class TriangelSquare {
    public static void main(String[] args) {
        int x1 = 1, y1 = 1;
        int x2 = 10, y2 = 7;
        int x3 = -3, y3 = 4;
        float length = 0;
        float square = 0;

        /*your code here*/
       float a = (float) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
       float b = (float) Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
       float c = (float) Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
       length = a + b + c;
       float p = length/2;
       square = (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));


        System.out.println("Length of all sides is " + length);
        System.out.println("Square is " + square);
    }
}
