package pl.derela.wszib.spotkanie5.hash;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("Wojtek");
        set.add("Agata");
        set.add("Wojtek");
        set.add("Wojtek"); // w zbiorze jest tylko jeden
        set.add("Tomek");

        System.out.println(set);
       /* set.remove("Wojtek");*/

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String el = iterator.next();
            System.out.println(el + " " + el.hashCode() );
        }

    }
}
