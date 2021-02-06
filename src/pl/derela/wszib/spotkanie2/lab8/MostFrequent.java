package pl.derela.wszib.spotkanie2.lab8;

public class MostFrequent {

    public static void main(String[] args) {

        int[] mostFrequent = {4, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3};

        int number = 0;
        int counter0 = 0;
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        int counter5 = 0;
        int counter6 = 0;
        int counter7 = 0;
        int counter8 = 0;
        int counter9 = 0;

        for (int i = 0; i < mostFrequent.length; i++) {
            number = mostFrequent[i];


            switch (number) {
                case 0:
                    counter0 += 1;
                    break;
                case 1:
                    counter1 += 1;
                    break;
                case 2:
                    counter2 += 1;
                    break;
                case 3:
                    counter3 += 1;
                    break;
                case 4:
                    counter4 += 1;
                    break;
                case 5:
                    counter5 += 1;
                    break;
                case 6:
                    counter6 += 1;
                    break;
                case 7:
                    counter7 += 1;
                    break;
                case 8:
                    counter8 += 1;
                    break;
                case 9:
                    counter9 += 1;
                    break;
            }
        }

        int [] counters = {counter0, counter1, counter2, counter3, counter4, counter5, counter6, counter7, counter8, counter9};
        System.out.printf("Tablica występowań cyfr: ");

        for (int i = 0; i < counters.length; i++) {
            System.out.printf(" " + counters[i]);

        }
        int mostFrequentNumber =0;
        int mFPos =0;
        for (int i = 0; i < counters.length; i++) {
            if (counters [i] > mostFrequentNumber) {
                mostFrequentNumber = counters [i];
                mFPos = i;
            }

        }
        System.out.println();
        System.out.println("Najczęćciej występuje cyfra : " +mFPos  + " ( "+mostFrequentNumber+" razy ).");

    }
}
