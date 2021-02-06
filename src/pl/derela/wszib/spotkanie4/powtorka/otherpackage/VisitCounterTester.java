package pl.derela.wszib.spotkanie4.powtorka.otherpackage;

import pl.derela.wszib.spotkanie4.powtorka.VisitCounter;

public class VisitCounterTester {

    public static void main(String[] args) {


        VisitCounter vc = new VisitCounter();
        vc.increment();
        for (int i = 0; i < 44; i++) {

            vc.increment();
        }
        System.out.println(vc.getCounter());


    }
}
