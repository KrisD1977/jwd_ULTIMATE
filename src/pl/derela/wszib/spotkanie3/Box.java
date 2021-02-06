package pl.derela.wszib.spotkanie3;

import java.awt.*;

public class Box {

    int x1;
    int y1;
    int x2;
    int y2;

    public Box(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Box (Point topLeft, Point bottomRight) {
        this(topLeft.x, topLeft.y, bottomRight.x, bottomRight.y);
    }

    public Box (Point topLeft, int w, int h) {
        this(topLeft.x, topLeft.y, topLeft.x + w, topLeft.y + h);
    }

    public void printBox () {

        System.out.println("Box: <" + x1 + " , " +y1  );
        System.out.println(", " + x2 + " , " +y2 + " > " );
    }

    public static void main(String[] args) {
        Box box = new Box(4,3,4,3);
        box.printBox();
        Box box2 = new Box(new Point(3,2),3,4);
        box2.printBox();
    }
}
