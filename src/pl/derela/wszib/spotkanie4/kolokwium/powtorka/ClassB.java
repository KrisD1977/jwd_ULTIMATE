package pl.derela.wszib.spotkanie4.kolokwium.powtorka;

public class ClassB {

    private static int x;

    static int[] upToX(int x) {
        int[] table = new int[x + 1];

        for (int i = 0; i <= x; i++) {
            table[i] = i;
            System.out.printf(Integer.toString(table[i]) + " ");

        }

        return table;
    }

    public static void main(String[] args) {
        try {
            x = Integer.parseInt(args[0]);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException  e) {
            System.out.println("Podaj prawidłowy argument");
        }
        upToX(x);
    }


}
