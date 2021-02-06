package pl.derela.wszib.spotkanie1;

public class Vars2 {

    public  int i;

    public static void main(String[] args) {

        Vars2 vars2 = new Vars2();

        System.out.println(vars2.i);

        String str1, str2;
        str1 = "tekst";
        str2 = "tekst";

        System.out.println((str1 == "tekst2")?"tak":"nie");
        System.out.println(str2.equals(str1));

    }
}
