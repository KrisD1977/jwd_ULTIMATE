package pl.derela.wszib.spotkanie3;

public class Vars {

    int i;  // zmienna egzemplarza (pole)
    static int j; // zmienna klasowa
    static int x;

    public int change () {
        int k = 7; // zmienna lokalna
        return i + (k * j);
    }

    public static void main(String[] args) {
        int i = 77;
        int x = 999;

        Vars v1 = new Vars();
        v1.i = 9;
        System.out.println("Zmienna egzemplarza dla v1: " +v1.i);

        Vars v2 = new Vars();
        v2.i = 5;
        System.out.println("Zmienna egzemplarza dla v2: " +v2.i);
        System.out.println("Zmienna statyczna (klasowa): " +Vars.j);
        System.out.println(v2.change());
        System.out.println(x);
        System.out.println(Vars.x);


    }

}
