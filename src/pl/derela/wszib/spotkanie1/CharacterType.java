package pl.derela.wszib.spotkanie1;

public class CharacterType {

    public static void main(String[] args) {

        showInfo('ą');
        showInfo('%');
        showInfo(';');


    }

     public static void showInfo (char c) {
        System.out.println("Kod znaku '" + c +"' to : " + (int)c);

    }
}
