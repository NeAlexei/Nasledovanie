package shape.circle.cylinder;

import shape.circle.Circle;

public class Cylinder extends Circle {
    private int height;

    public Cylinder(String name, String color, double radius, int height) {
        super(name, color, radius);
        this.height = height;
    }

    public void setHeight(){
        this.height = height;
    }

    public int getHeight(){
        return height;
    }

    public double countVolume(){
        return (3.14 * getRadius() * getRadius()) * getHeight();
    }


}
