package pl.derela.wszib.spotkanie2.zadanie2;

public class ArrayN {



    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Nie podano liczby n !!!");
            System.exit(-1);
        }
        int n = Integer.valueOf(args[0]);

        createArray(n);
        showArray(n);
        showRevArray(n);



    }

     static void createArray(int n) {

        int[] arrayN = new int[n];
        for (int i = 1; i <= n; i++) {
            arrayN[i-1] = i;
        }
    }

     static void showArray(int n) {
        System.out.print("Tablica " + n + " elementów: ");
        int[] arrayN = new int[n];
        for (int i = 1; i <= n; i++) {
            arrayN[i-1] = i;
        }
        for (int i = 0; i < arrayN.length; i++) {
            System.out.print(arrayN[i] + " ");
        }
    }

     static void showRevArray(int n) {
        System.out.print("\nTablica odwrotna " + n + " elementów: ");
        int[] arrayN = new int[n];
        for (int i = 1; i <= n; i++) {
            arrayN[i-1] = n - i +1;
        }
        for (int i = 0; i < arrayN.length; i++) {
            System.out.print(arrayN[i] + " ");
        }
    }


}
