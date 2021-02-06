package pl.derela.wszib.spotkanie1;

import java.awt.*;

public class Objects {

    public static void main(String[] args) {

        Object object = new Object();
        Object object2;
        Object object3 = new Object();

        object2 = object;
        object = null;

        Point point = new Point(0,2);
        Point point2 = point;
        System.out.println(point.x + " " + point.y);

        point2.x = 10;
        System.out.println(point.x + " " + point.y);


    }
}
