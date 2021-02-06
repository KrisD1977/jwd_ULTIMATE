package pl.derela.wszib.spotkanie4.kolokwium;

public class ZadanieB {
    public int x = 10;

    public ZadanieB(int x) {
        this.x = x;
    }

    public void showNumbers () {

        for (int i = 0; i <= x; i++) {
            System.out.printf(i + " ");
        }

    }

    public static void main(String[] args) {
        ZadanieB z = new ZadanieB(15);

        z.showNumbers();

    }
}
