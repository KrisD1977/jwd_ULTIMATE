package pl.derela.wszib.spotkanie4.powtorka.lab17;

public class CardinalPointsTester {
    public static void main(String[] args) {

        for ( CardinalPoints cardinalPoints1 : CardinalPoints.values()){
            System.out.println(cardinalPoints1.getName()+ " to po polsku: " +cardinalPoints1.getNameInPolish()+
                    ", a po angielsku: "+cardinalPoints1.getNameInEnglish());

        }
    }
}
