package pl.derela.wszib.spotkanie3;

import java.awt.*;

public class NamedPoint extends Point {

    String name;

    public NamedPoint(int x, int y, String name) {
        super(x, y);
        this.name = name;
    }

    static void showPoint (NamedPoint np) {
        System.out.println("( " +np.x + " , " +np.y + " ) " + np.name   );

    }

    void showPoint () {
        System.out.println("( " + x + " , " +y + " ) " + name   );

    }

    public static void main(String[] args) {

        NamedPoint np = new NamedPoint(5,5,"SmallPoint");
        System.out.println("x wynosi " + np.x);
        System.out.println("y wynosi " + np.y);
        System.out.println("name wynosi " + np.name);

        showPoint(np);
        np.showPoint();
    }
}
