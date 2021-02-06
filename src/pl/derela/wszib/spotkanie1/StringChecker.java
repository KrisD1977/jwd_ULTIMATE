package pl.derela.wszib.spotkanie1;

public class StringChecker {

    public static void main(String[] args) {

        String str = "Lannister zawsze spłaca swoje długi.";


        System.out.println("Tekst to: " +str);
        System.out.println("Długość tekstu to: " +str.length() + " znaków.");

        System.out.println("Znak na poz 10 to: " +str.charAt(9));
        System.out.println("Fragment od znaku 11 do 17: " +str.substring(10,16));
        System.out.println("Indeks pierwszej litery t: " + (str.indexOf('t')+1));
        System.out.println("Indeks początku podtekstu \" długi \": " + (str.indexOf("długi")+1));
        System.out.println("Tekst wielkimi literami: " +str.toUpperCase());


        char [] litery = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            litery [i] = str.charAt(i);

        }
        for (int i = 0; i < litery.length; i++) {
            System.out.println(litery[i]);

        }

    }
}
