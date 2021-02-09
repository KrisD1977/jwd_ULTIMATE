package pl.derela.wszib.spotkanie4.powtorka.lab14;

import java.util.Random;

public class AnimalShelter {

    public static int cageNumber = 33;

    public static void main(String[] args) {


        Animal[] shelter = new Animal[100];
        Random random = new Random();


        for (int i = 0; i < shelter.length; i++) {
            int r = random.nextInt(3);
            if (r == 0) {
                shelter[i] = new Dog();
            } else if (r == 1) {
                shelter[i] = new Cat();
            } else {
                shelter[i] = new Bird();
            }


        }
        for (int i = 0; i < shelter.length; i++) {

            System.out.printf(shelter[i].getType());
            System.out.printf(Integer.toString(shelter[i].getInstanceNumber()));
            System.out.printf(" ");

        }
        System.out.println("\n");
        System.out.printf("Zwierzę w " + cageNumber + " kojcu to: ");
        System.out.printf(shelter[cageNumber - 1].getType());
        System.out.println();
        System.out.printf("Takich zwierząt jest: ");
        System.out.printf(Integer.toString(shelter[7].getInstanceNumber()));


    }
}
