package pl.derela.wszib.spotkanie1.lab6;

import java.util.StringTokenizer;

public class DateToken {

    public static void main(String[] args) {

        String date = "15/01/2021";

        StringTokenizer tokenizer = new StringTokenizer(date,"/");

        System.out.print("Podana data to: " + tokenizer.nextToken());
        System.out.print(" dzień, " + tokenizer.nextToken());
        System.out.print(" miesiąc, " + tokenizer.nextToken());
        System.out.print(" rok.");
    }
}
