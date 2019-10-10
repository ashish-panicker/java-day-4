package com.shapes1;

import java.util.*;

public class Circle implements Shape {



    private float radius;
    private final float PI;

    public Circle(float radius){
        PI = 3.14f;
        this.radius = radius;
    }

    @Override
    public String info() {
        return null;
    }

    @Override
    public void area() {
        System.out.println(PI * (radius * radius));
    }

    @Override
    public void draw(Paint p) {
        System.out.println("The color of the circle is " + p);
    }
}
