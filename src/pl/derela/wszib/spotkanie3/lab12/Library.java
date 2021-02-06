package pl.derela.wszib.spotkanie3.lab12;

public class Library {

    public static void main(String[] args) {

        Book [] library = new Book[4];

        Book book1 = new Book("Pan Tadeusz", "Mickiewicz Adam", "PWN",2000);
        Book book2 = new Book("Pan Tadeusz", "Mickiewicz Adam", "PWN",2005);
        Book book3 = new Book("Dziady", "Mickiewicz Adam", "PWN",2010);
        Book book4 = new Book("Balladyna", "Słowacki Juliusz", "PWN",2003);

        library[0] = book1;
        library[1] = book2;
        library[2] = book3;
        library[3] = book4;

        for (int i = 0; i < library.length; i++) {
            System.out.println(library[i]);

        }

        System.out.println("Książka 1 i książka 2 są jednakowe: " + (library[0].equals(library[1])));



    }
}
