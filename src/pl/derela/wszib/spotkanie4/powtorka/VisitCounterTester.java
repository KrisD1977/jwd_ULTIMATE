package pl.derela.wszib.spotkanie4.powtorka;

public class VisitCounterTester {

    public static void main(String[] args) {

        VisitCounter visitCounter = new VisitCounter();
        visitCounter.increment();
       /* visitCounter.counter++;             nie działają bo private
        visitCounter.counter = 6;
        visitCounter.counter = -100;*/

        System.out.println(visitCounter.getCounter());

    }
}

