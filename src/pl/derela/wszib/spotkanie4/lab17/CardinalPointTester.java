package pl.derela.wszib.spotkanie4.lab17;

public class CardinalPointTester {

    public static void main(String[] args) {

        /*CardinalPoint cp;
        System.out.println("Kierunek: " + cp.getNamePl() + " to po angielsku " + cp.getNameEn() + ",  ma wartość " +cp.getRotation() + "stopni.");
*/
        for (CardinalPoint cp: CardinalPoint.values()) {
            System.out.print("Kierunek " + cp.getNamePl() );
            System.out.print(", skrót to: " + cp.name() );
            System.out.println();
        }


    }
}
