package shape.rectangle.cube;

import shape.rectangle.Rectangle;

public class Cube extends Rectangle {
    private int height;

    public Cube(String name, String color, int length, int width, int height) {
        super(name, color, length, width);
        this.height = height;
    }

    public void setHeigh(){
        this.height = height;
    }

    public int getHeight(){
        return height;
    }

    public double countVolume(){
        return countSquare() * height;
    }



}
