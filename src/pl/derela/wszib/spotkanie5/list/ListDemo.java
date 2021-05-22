package pl.derela.wszib.spotkanie5.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(123);
        myList.add(4);
        myList.add(123);
        myList.add(5);

        System.out.println(myList.get(1));
        System.out.println(myList);
        myList.remove(1);
        System.out.println(myList);
        System.out.println(myList.get(0));
        myList.clear();
        System.out.println(myList);
        System.out.println("------------------------------------------");


        List<String> myList2 = new ArrayList<>();
        myList2.add("Staszek");
        myList2.add("Stas");
        myList2.add("Stanislaw");
        myList2.add("Staszka");
        myList2.add("Starek");

        /*for (int i = 0; i < myList2.size(); i++) {
            System.out.println(myList2.get(i));
        }*/

      /*  for (String s : myList2) {
            System.out.println(s);
        }*/

        /*Iterator<String> iterator = myList2.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/

        ListIterator<String> iterator = myList2.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("----------------------------------------------");

        while (iterator.hasPrevious()) {
            Integer index = iterator.previousIndex();
            String value = iterator.previous();
            System.out.println(index + " " + value);
        }


    }
}
