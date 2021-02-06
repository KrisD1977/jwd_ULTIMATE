package pl.derela.wszib.spotkanie1.lab5;

public class CanBeDivided {

    public static void main(String[] args) {

        isTrue(15);
        isTrue(14);
        isTrue(70);
        isTrue(144);
        isTrue(350);

    }


    static void isTrue(int x) {
        if (((x % 7) == 0) && ((x % 5) == 0)) {
            System.out.println(x + " jest podzielna przez 5 i 7 ");
        } else {
            System.out.println(x + " nie jest podzielna przez 5 i 7 ");
        }
    }
}
