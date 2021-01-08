package pl.derela.wszib.zadanie3;

import java.util.Random;

public class Parkings {

    public static void main(String[] args) {


        Car[] motomachi = new Car[5000];
        Car[] tsutsumi = new Car[4500];
        Car[] tahara = new Car[1700];

        String[] colors = {"silver", "blue", "black"};
        String[] models = {"Aygo", "Yaris", "Corolla"};
        int[] prodYears = {2018, 2019, 2020};

        Random random = new Random();

        for (int i = 0; i < motomachi.length; i++) {
            motomachi[i] = new Car(models[random.nextInt(models.length)], colors[random.nextInt(colors.length)], prodYears[random.nextInt(prodYears.length)]);
        }

        for (int i = 0; i < tsutsumi.length; i++) {
            tsutsumi[i] = new Car(models[random.nextInt(models.length)], colors[random.nextInt(colors.length)], prodYears[random.nextInt(prodYears.length)]);
        }
        for (int i = 0; i < tahara.length; i++) {
            tahara[i] = new Car(models[random.nextInt(models.length)], colors[random.nextInt(colors.length)], prodYears[random.nextInt(prodYears.length)]);
        }

        System.out.println("Pierwsze dziesięć samochodów w Taharze to: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(tahara[i]);
        }
        System.out.println("-------------------------------------------");


        System.out.println("Na parkingu Motomachi: ");

        Car yarisSilver2020 = new Car("Yaris", "silver", 2020);
        int counterYaris = 0;

        for (int i = 0; i < motomachi.length; i++) {
            if (motomachi[i].equals(yarisSilver2020)) {
                counterYaris = counterYaris + 1;
            }
        }
        System.out.println("Ilość:" + yarisSilver2020 + " wynosi: " + counterYaris);
        System.out.println("-------------------------------------------------");


        int silverCounter = 0;
        int blueCounter = 0;
        int blackCounter = 0;


        for (int i = 0; i < tsutsumi.length; i++) {

            if (tsutsumi[i].color == "silver") {
                silverCounter = silverCounter + 1;

            } else if (tsutsumi[i].color == "blue") {
                blueCounter = blueCounter + 1;
            } else {
                blackCounter = blackCounter + 1;
            }

        }
        int[] counters = {silverCounter, blueCounter, blackCounter};
        int mostFrequent = 0;

        for (int i = 0; i < counters.length; i++) {
            if (counters[i] > mostFrequent) {
                mostFrequent = counters[i];
            }

        }
        for (int i = 0; i < counters.length; i++) {
            if (counters[i] == mostFrequent) {

                System.out.println("Na parkingu Tsutsumi najwiecej samochodów jest koloru " + colors[i] + ":" + mostFrequent);
            }
        }

        System.out.println("Srebrnych: " + silverCounter + " niebieskich: " + blueCounter + " czarnych: " + blackCounter);
        System.out.println("W sumie :" + (silverCounter + blueCounter + blackCounter));







       /* for (int i = 0; i < motomachi.length; i++) {
            System.out.println(motomachi[i]);
        }
        for (int i = 0; i < tsutsumi.length; i++) {
            System.out.println(tsutsumi[i]);
        }
        for (int i = 0; i < tahara.length; i++) {
            System.out.println(tahara[i]);
        }*/
    }
}