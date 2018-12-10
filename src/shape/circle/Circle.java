package shape.circle;

import shape.Shape;

public class Circle extends Shape {
    private double radius;

    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    public void setRadius(){
        this.radius = radius;
    }

    public  double getRadius(){
        return radius;
    }

    public double countSquare(){
         return 3.14 * radius * radius;
    }



}
