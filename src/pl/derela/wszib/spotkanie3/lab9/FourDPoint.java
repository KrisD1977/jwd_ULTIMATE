package pl.derela.wszib.spotkanie3.lab9;

import java.awt.*;

public class FourDPoint extends Point {
    Point p = new Point();
    int z, t;

    static FourDPoint create(Point p, int z, int t) {
        FourDPoint fourDPoint = new FourDPoint();
        fourDPoint.p = new Point(p);
        fourDPoint.z = z;
        fourDPoint.t = t;
        return fourDPoint;

    }

    void show() {
        System.out.println("Czterowymiarowy punkt ma współrzędne: " + this.p + ", " + this.z + ", " + this.t);

    }

    @Override
    public String toString() {
        return "FourDPoint{" +
                "p=" + p +
                ", z=" + z +
                ", t=" + t +
                '}';
    }


    public static void main(String[] args) {
        FourDPoint fourDPoint = new FourDPoint();
        fourDPoint.p = new Point(1, 2);
        fourDPoint.z = 3;
        fourDPoint.t = 4;
        System.out.println(fourDPoint);
        fourDPoint.show();


        FourDPoint fdp2 = create(new Point(2, 3), 4, 6);
        System.out.println(fdp2);
        fdp2.show();


    }
}

