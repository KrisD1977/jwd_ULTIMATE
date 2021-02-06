package pl.derela.wszib.spotkanie2.lab7;

public class MatrixN {

    public static void main(String[] args) {

        showMatrix(2);
        System.out.println();
        showMatrix(3);
        System.out.println();
        showMatrix(4);
        System.out.println();
        showMatrix(-5);
        showMatrix(31);
    }


    public static void showMatrix(int n) {

        if ((n >= 0) && (n <= 30)) {

            System.out.println(" n = " + n + "   matrix");
            System.out.println(" ---------------- ");
            for (int i = 0; i < n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.printf("%3s", i + j);
                }
                System.out.println();

            }
        } else {
            System.out.println("Podaj liczbę od 0 do 30.");
        }
    }

}
