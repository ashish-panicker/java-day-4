package com.shapes1;

public class Main {


    public static void main(String [] arg){

        Shape square = new Square();
        square.area();

        float r = 5.4f;

        Circle circle = new Circle(5.3f);
        circle.area();
        circle.draw(Paint.RED);

    }
}
