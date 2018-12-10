package shape.rectangle;

import shape.Shape;

public class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle(String name, String color, int length, int width) {
        super(name, color);
        this.length = length;
        this.width = width;
    }

    public void setLength(){
        this.length = length;
    }

    public int getLength(){
        return length;
    }

    public void setWeigth(){
        this.width = width;
    }

    public int getWidth(){
        return width;
    }

    public double countSquare(){
        return length * width;
    }



}
