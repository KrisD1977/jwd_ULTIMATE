package pl.derela.wszib.spotkanie4;

public class InstanceCounter {

    private static int numInstances = 0;

    public static int getCount () {
        return numInstances;
    }

    private static void addInstances () {
        numInstances++;
    }

    InstanceCounter () {
        InstanceCounter.addInstances();
    }

}
