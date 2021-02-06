package pl.derela.wszib.spotkanie1;

public class MarsApplication {

    public static void main(String[] args) {

        MarsRobot spirit = new MarsRobot();
        spirit.status = "eksploracja";
        spirit.speed = 2;
        spirit.temperature = -60;
        spirit.name = "Spirit";

        spirit.showAttributes();
        System.out.println("-------------------------");

        System.out.println("Zwiększenie prędkości do 3");
        spirit.speed = 3;
        spirit.showAttributes();
        System.out.println("----------------------");

        System.out.println("Zmiana temperatury na -90");
        spirit.temperature = -90;
        spirit.showAttributes();
        System.out.println("----------------------");

        System.out.println("Sprawdzenie temperatury");
        spirit.checkTemperature();
        spirit.showAttributes();
        System.out.println("----------------------------");

        MarsRobot opportunity = new MarsRobot();
        opportunity.name = "Opportunity";
        opportunity.status = "eksploracja";
        opportunity.speed = 7;
        opportunity.temperature = -10;

        System.out.println("Opportunity");
        opportunity.showAttributes();
        opportunity.checkTemperature();
        System.out.println("----------------------");
        opportunity.showAttributes();
        opportunity.checkStatus();
        System.out.println("-----------------------");
        System.out.println("Po sprawdzeniu statusu: " + opportunity.name);
        opportunity.showAttributes();
        System.out.println("----------------");

        MarsRobot sputnik = new MarsRobot();
        sputnik.name = "sputnik";
        sputnik.speed = 10;
        sputnik.status = "eksploracja";
        sputnik.temperature = -100;
        sputnik.checkStatus();
        sputnik.checkTemperature();
        sputnik.showAttributes();


    }
}
