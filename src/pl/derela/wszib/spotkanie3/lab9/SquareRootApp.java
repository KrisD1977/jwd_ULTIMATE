package pl.derela.wszib.spotkanie3.lab9;

public class SquareRootApp {

    public static void main(String[] args) {



        if (args.length > 0) {

            double i = Double.parseDouble(args[0]);

            System.out.println("Pierwiatek kwadratowy z " + i + " wynosi " + Math.sqrt(i));
        } else {
            System.out.println("Podaj liczbę");
            System.exit(-1);

        }
    }
}
