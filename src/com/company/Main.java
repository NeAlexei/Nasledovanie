package com.company;

import shape.Shape;

import shape.circle.Circle;
import shape.circle.cylinder.Cylinder;

import shape.rectangle.Rectangle;
import shape.rectangle.cube.Cube;

public class Main {
    public static void main(String[] args){
        Circle circle = new Circle("circle", "red", 10);
        System.out.println("Circle square is: " + circle.countSquare());

        System.out.println();

        Cylinder cylinder = new Cylinder("cylinder", "black", 10, 2);
        System.out.println("Cylinder volume is: " + cylinder.countVolume());

        System.out.println();

        Rectangle rectangle = new Rectangle("rectangle01", "yellow", 2, 3);
        System.out.println("Rectangle square is: " + rectangle.countSquare());

        System.out.println();

        Cube cube = new Cube ("cube01", "green", 2, 3, 4);
        System.out.println("Cube volume is: " + cube.countVolume());
    }
}
