package pl.derela.wszib.spotkanie2;

public class Loops {

    public static void main(String[] args) {

        int a = -8;

        if (a > 0) {
            System.out.println("Jest większe od O");
        } else if (a == 0) {
            System.out.println("Jest równe 0");
        } else {
            System.out.println("Jest mniejsze od 0");
        }


        // w switch mozna uzywać;
        // byte Byte
        //short Short
        // int Integer
        //char Character
        //String
        //enum


        char grade = 'G';

        switch (grade) {
            case 'A':
                System.out.println("Wspaniale");
                break;
            case 'B':
                System.out.println("Dobrze");
                break;
            case 'C':
                System.out.println("Mogło być lepiej");
                break;
            default:
                System.out.println("Rozważ oszukiwanie");
        }


    }
}
