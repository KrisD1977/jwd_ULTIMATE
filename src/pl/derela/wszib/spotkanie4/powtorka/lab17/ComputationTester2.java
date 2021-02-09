package pl.derela.wszib.spotkanie4.powtorka.lab17;

public class ComputationTester2 {

    public static void main(String[] args) {

        double x = 3.5;
        double y = -2.5;

        System.out.println("Mnożenie: "+ x + " * " + y + " = " +Computation2.MULTIPLY.perform(x,y));
        System.out.println("Dzielenie: "+ x + " / " + y + " = " +Computation2.DIVIDE.perform(x,y));
        System.out.println("Dodawanie: "+ x + " + " + y + " = " +Computation2.ADD.perform(x,y));
        System.out.println("Odejmowanie: "+ x + " - " + y + " = " +Computation2.SUBTRACT.perform(x,y));
        System.out.println("----------------------------");

        double x1 = 1;
        double y1 = -5;

        System.out.println("Mnożenie: "+ x1 + " * " + y1 + " = " +Computation2.MULTIPLY.perform(x1,y1));
        System.out.println("Dzielenie: "+ x1 + " / " + y1 + " = " +Computation2.DIVIDE.perform(x1,y1));
        System.out.println("Dodawanie: "+ x1 + " + " + y1 + " = " +Computation2.ADD.perform(x1,y1));
        System.out.println("Odejmowanie: "+ x1 + " - " + y1 + " = " +Computation2.SUBTRACT.perform(x1,y1));

    }
}
