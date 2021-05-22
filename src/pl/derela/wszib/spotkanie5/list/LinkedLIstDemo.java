package pl.derela.wszib.spotkanie5.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedLIstDemo {
    public static void main(String[] args) {
        List<String> elements = new LinkedList<>();

        elements.add("pierwszy");
        elements.add("drugi");
        elements.add("trzeci");
        elements.add("czwarty");
        elements.add("piąty");

        System.out.println(elements);

        elements.remove("drugi");
        System.out.println(elements);
    }
}
