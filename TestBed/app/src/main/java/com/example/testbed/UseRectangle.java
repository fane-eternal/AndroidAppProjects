package com.example.testbed;

import com.example.testbed.chapter1.Rectangle1;

public class UseRectangle {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        int a = Rectangle1.getArea(x, y);
        int c = Rectangle1.getCircumference(x, y);
        System.out.println(a);
        System.out.println(c);
    }
}
