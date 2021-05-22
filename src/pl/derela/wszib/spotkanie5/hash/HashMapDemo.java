package pl.derela.wszib.spotkanie5.hash;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {

        Map<String, String> phones = new HashMap<>();
        phones.put("Tomek","567-565-541");
        phones.put("Alicja","234-565-541");
        phones.put("Tomek","999-999-999");
        phones.put("Barbara","999-999-999");

        System.out.println(phones);

        Set<String> keys = phones.keySet();
        System.out.println(keys);

        Collection<String> values = phones.values();
        System.out.println(values);

        System.out.println(phones.get("Alicja"));
        System.out.println("----------------------------------------");

        for (Map.Entry entry: phones.entrySet()) {
            System.out.println(entry);
            System.out.println("Kto: " + entry.getKey() + "-> telefon: " + entry.getValue());

        }

    }
}
