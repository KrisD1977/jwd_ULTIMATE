package pl.derela.wszib.spotkanie1.zadanie1;

public class Zoo  {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Animal dog = new Dog();
    }
}

class Animal {

}

class Dog extends Animal implements Voice {

}

class Cat extends Animal implements Voice{

}
interface Voice {

}