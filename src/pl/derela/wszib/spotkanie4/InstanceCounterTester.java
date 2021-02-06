package pl.derela.wszib.spotkanie4;

public class InstanceCounterTester {

    public static void main(String[] args) {

     /*   InstanceCounter ic = new InstanceCounter();*/

        System.out.println("Rozpoczynanie z " +InstanceCounter.getCount() + " obiektów");

        for (int i = 0; i < 500; i++) {
            new InstanceCounter();

        }

        System.out.println("Utworzono " +InstanceCounter.getCount() + " obiektów");

        for (int i = 0; i < 400; i++) {
            new InstanceCounter();

        }

        System.out.println("Utworzono " +InstanceCounter.getCount() + " obiektów");

            }


}
