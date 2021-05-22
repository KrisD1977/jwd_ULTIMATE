package pl.derela.wszib.spotkanie5.lab18;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class BookAlice {
    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Paths.get("files/alice30.txt"));
            System.out.println(lines.size());

            Set<String> words = new TreeSet<>();

            for (String line : lines) {

                /*line = line.replaceAll("[!,.:;']|[0-9]", "");*/
                line = line.replaceAll("\\p{Punct}|\\d", "");

               /* line = line.replace("!", "");
                line = line.replace(",", "");
                line = line.replace(".", "");*/

                String[] wordArr = line.split(" |--");
                for (String word : wordArr) {
                    if (!word.isEmpty()) {
                        words.add(word);
                    }
                }

            }
            for (String word : words) {
                System.out.println(word);

            }
            System.out.println();
            System.out.println(words.size());

            Map<Character, Integer> stat = new HashMap<>();
            for (String word : words) {
                char currentFirstChar = word.toLowerCase(Locale.ROOT).charAt(0);
                if (stat.containsKey(currentFirstChar)) {
                    stat.put(currentFirstChar, stat.get(currentFirstChar) + 1);
                } else {
                    stat.put(currentFirstChar, 1);
                }
            }
            System.out.println("-------------------------");
            System.out.println(stat);

            Map<Integer, Character> sortedStat = new TreeMap<>(Collections.reverseOrder());
            for(Map.Entry<Character, Integer> entry: stat.entrySet()) {
                sortedStat.put(entry.getValue(), entry.getKey());

            }
            System.out.println("----------------------");
            System.out.println(sortedStat);
            System.out.println("Liczba unikatowych wyrazów: " + words.size());
            System.out.println("Najwięcej wyrazów na literę: "  + sortedStat);


        } catch (IOException e) {
            /*e.printStackTrace();*/
            System.out.println("Coś poszło nie tak z przy wczytywaniu pliku: " + e.getMessage());
        }
    }
}
