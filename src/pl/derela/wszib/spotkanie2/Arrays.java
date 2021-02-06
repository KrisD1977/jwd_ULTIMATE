package pl.derela.wszib.spotkanie2;

import java.awt.*;

public class Arrays {
    public static void main(String[] args) {

        Point[] markup = { new Point(1,1), new Point(2,3), new Point(3,0)};
        Point p = new Point(3,3);

        markup[2] = p;
        markup[1] = markup[2];

        p.y = 999;

        for (int i = 0; i < markup.length; i++) {
            System.out.println(markup[i]);

        }
    }
}
