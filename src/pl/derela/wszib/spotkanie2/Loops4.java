package pl.derela.wszib.spotkanie2;

public class Loops4 {

    public static void main(String[] args) {

        int counter = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 50; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.println("i = " + i + " j = " + j + " k = " + k);
                    counter++;
                }
            }
            System.out.println("Counter = " + counter);
        }
    }
}
