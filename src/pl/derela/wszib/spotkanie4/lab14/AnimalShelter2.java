package pl.derela.wszib.spotkanie4.lab14;

import java.util.Random;

public class AnimalShelter2 {

    public static final int PEN_NUMBER = 10;

    public static void main(String[] args) {

        Random random = new Random();


        Animal2[] animal2s = new Animal2[100];

        for (int i = 0; i < animal2s.length; i++) {
            int r = random.nextInt(3);

            switch (r) {
                case 0:
                    animal2s[i] = new Cat2();
                    break;

                case 1:
                    animal2s[i] = new Dog2();
                    break;

                case 2:
                    animal2s[i] = new Hamster2();


            }


        }

        System.out.println("W " + PEN_NUMBER + " kojcu znajduje się " +animal2s[PEN_NUMBER -1].getType());
        System.out.println(", wszystkich jest " + animal2s[PEN_NUMBER-1].getInstanceNumber() + ".");




       /* animal2s [0] = new Cat2();
        animal2s [1] = new Dog2();
        animal2s [2] = new Dog2();

        System.out.println(animal2s[0].getType());
        System.out.println(animal2s[0].getInstanceNumber());

        System.out.println(animal2s[1].getType());
        System.out.println(animal2s[1].getInstanceNumber());

        System.out.println(animal2s[2].getType());
        System.out.println(animal2s[2].getInstanceNumber());*/


        }
    }
