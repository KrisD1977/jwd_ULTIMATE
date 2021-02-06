package pl.derela.wszib.spotkanie1.lab3;

public class Squares {

     public int a;

     public static void squares(int a) {
        System.out.println("Pole powierzchni kwadratu o boku: " + a + " wynosi: " + a * a + ", obwód: " + 4 * a +
                ", a przekatna: " + a * Math.sqrt(2));


    }

    public static void main(String[] args) {

        Squares squares = new Squares();
        squares.squares(2);
        squares.squares(7);
        squares.squares(11);
        squares.squares(19);

        squares(3);


    }

}
