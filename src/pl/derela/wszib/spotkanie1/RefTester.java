package pl.derela.wszib.spotkanie1;

import java.awt.*;

public class RefTester {

    public static void main(String[] args) {

        Point pt1, pt2;

        pt1 = new Point(100,100);
        pt2 = new Point(100,100);

        /*pt2 = pt1;

        pt1.x = 500;*/

        System.out.println("punkt 1:  " +pt1.x + "," +pt1.y);
        System.out.println("punkt 2:  " +pt2.x + "," +pt2.y);

        System.out.println(pt1 ==pt2);
        System.out.println(pt2.equals(pt1));

        MarsRobot r1 = new MarsRobot();
        MarsRobot r2 = r1;
        MarsRobot r3 = new MarsRobot();

        System.out.println(r1.equals(r2));
        System.out.println(r3.equals(r1));



    }
}