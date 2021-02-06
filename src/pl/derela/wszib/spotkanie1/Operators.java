package pl.derela.wszib.spotkanie1;

public class Operators {
    public static void main(String[] args) {

        int a = 7;
        int b = 2;

        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(7 / 2);
        System.out.println(7 / 2F);
        System.out.println(7 / 2.);
        System.out.println(7 % 2);

        // operatory jednoargumentowe

        int f = 5;
        int g = -f;
        System.out.println();
        System.out.println(g);

        //inkrementacja, dekrementacja

        int i, o, p;
        i = 42;
        o = i++;
        p = ++i;

        System.out.println();
        System.out.println("i = " + i);
        System.out.println("o = " + o);
        System.out.println("p = " + p);

        ///

        int w = 0, e, r = 20;
        e = w++ + w++;
        r = r-- + ++r;

        System.out.println();
        System.out.println("w: " + w);
        System.out.println("e: " + e);
        System.out.println("r: " + r);


        int t=0, h=5;
        boolean test = (t < 0) && (h++ > 3);
        System.out.println();
        System.out.println(test);
        System.out.println(h);

        boolean test2 = (t < 0) & (h++ > 3);

        System.out.println();
        System.out.println(test2);
        System.out.println(h);

        int age = 33;
        boolean testAge = !(age <25);
        System.out.println();
        System.out.println(testAge);


    }
}
