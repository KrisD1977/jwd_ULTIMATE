package pl.derela.wszib.spotkanie5.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo4 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);

        System.out.println(Collections.frequency(list,"bbb"));

    }
}
