package pl.derela.wszib.spotkanie4.powtorka;

public class InstanceCounter {

    private static int numberInstances = 0;

    public static int getNumberInstances() {
        return numberInstances;

    }
    private static void addInstance() {
        numberInstances++;
    }

    public InstanceCounter() {
        InstanceCounter.addInstance();
    }


}
