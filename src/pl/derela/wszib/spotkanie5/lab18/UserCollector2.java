package pl.derela.wszib.spotkanie5.lab18;

import java.util.HashMap;
import java.util.Map;

public class UserCollector2 {
    public static void main(String[] args) {
        Map<Integer, User2> user2Map = new HashMap<>();
        user2Map.put(1,new User2("Jan", "Kowalski", 25));
        user2Map.put(2,new User2("Tomasz", "Piotrowski", 12));
        user2Map.put(3,new User2("Agata", "Nowak", 33));
        user2Map.put(4,new User2("Jan", "Kowalski", 25));
        user2Map.put(5,new User2("Agata", "Nowak", 33));
        user2Map.put(6,new User2("Agata", "Nowak", 33));

        for (User2  user2 : user2Map.values()) {
            System.out.println(user2);

        }


    }
}
