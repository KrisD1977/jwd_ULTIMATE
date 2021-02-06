package pl.derela.wszib.spotkanie2.lab8;

public class MostFrequent2 {

    public static void main(String[] args) {

        int[] mostFrequent = {4, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3};
        int[] counters = new int[10];


        for (int i = 0; i < mostFrequent.length; i++) {
            counters[mostFrequent[i]]++;
        }

        int mF = 0;

        for (int i = 0; i < counters.length; i++) {
            if (counters[i] > mF) {
                mF = i;
            }
        }
        System.out.println("Najczęsciej występuje: " + mF + ", wystąpiła  " + counters[mF] + " razy.");

        /*for (int i : counters) {
            System.out.printf(" " + i);
        }*/
    }
}

