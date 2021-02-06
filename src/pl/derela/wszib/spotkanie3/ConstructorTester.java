package pl.derela.wszib.spotkanie3;

public class ConstructorTester {

    public static void main(String[] args) {

        X x = new X();
        X x1 = new X("Kot");
        System.out.println();

        Y y = new Y();
        System.out.println();
        Y y1 = new Y("Pies");

    }


}

class X {

    X() {
        System.out.println("Działa konstruktor X");
    }

    X(String param) {
        System.out.println("Działa konstruktor X z " + param);
    }

}

class Y extends X {

    Y() {
        super(); // wywołanie domyślne
        System.out.println("Działa konstruktor Y");
    }

    Y(String param) {
        // super();   - było wywołanie domyślne
        super(param);
        System.out.println("Działa konstruktor Y z " + param);
    }

}