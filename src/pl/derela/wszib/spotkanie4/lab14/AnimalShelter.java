package pl.derela.wszib.spotkanie4.lab14;

import java.util.Random;

public class AnimalShelter {

    public static void main(String[] args) {

        Animal [] shelter = new Animal [100];

        Cat cat = new Cat();
        Dog dog = new Dog();
        Bird bird = new Bird();


        Animal [] animalTypes = {cat, dog, bird};

        Random random = new Random();
        int r = random.nextInt(3);

        for (int i = 0; i < 10; i++) {
            shelter [i] = animalTypes[0] ;
                }

        System.out.println(shelter [0]);

    }
}
