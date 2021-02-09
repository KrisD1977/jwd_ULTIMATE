package pl.derela.wszib.spotkanie4.powtorka;

public class InstanceCounterTester {

    public static void main(String[] args) {

        InstanceCounter ic = new InstanceCounter();
        System.out.println(InstanceCounter.getNumberInstances());

        System.out.println("Rozpoczęcie z :" +InstanceCounter.getNumberInstances());
        for (int i = 0; i < 500; i++) {
            new InstanceCounter ();

        }
        System.out.println("Utworzono: " + InstanceCounter.getNumberInstances() + " obiektów.");

        for (int i = 0; i < 200; i++) {
            new InstanceCounter ();

        }
        System.out.println("Utworzono: " + InstanceCounter.getNumberInstances() + " obiektów.");



    }
}
