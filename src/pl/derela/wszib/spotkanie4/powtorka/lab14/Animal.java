package pl.derela.wszib.spotkanie4.powtorka.lab14;

abstract public class Animal {
    abstract String getType();
    abstract public int getInstanceNumber();
    }


class Dog extends Animal {
    private static int dogsNumber;

    @Override
    String getType() {
        return "Pies";
    }

    private void add() {
        dogsNumber++;
    }

    public Dog() {
        add();

    }

    @Override
    public int getInstanceNumber() {
        return dogsNumber;
    }
}

class Cat extends Animal {

    private static int catsNumber;

    @Override
    String getType() {
        return "Kot";
    }

    void add() {
        catsNumber++;
    }

    public Cat() {
        add();

    }

    @Override
    public int getInstanceNumber() {
        return catsNumber;
    }
}

class Bird extends Animal {

    private static int birdsNumber;

    @Override
    String getType() {
        return "Ptak";

    }

    void add() {
        birdsNumber++;
    }

    public Bird() {
        add();

    }

    @Override
    public int getInstanceNumber() {
        return birdsNumber;
    }
}
