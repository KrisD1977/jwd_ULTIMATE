package pl.derela.wszib.spotkanie5.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(7);

       /* Integer[] arr = new Integer[list.size()];
        arr = list.toArray(arr);*/

        Integer[] arr = list.toArray(new Integer[list.size()]);

        System.out.println(arr.length);

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(list);
        numbers.addAll(list);
        numbers.addAll(list);
        numbers.addAll(list);

        System.out.println(numbers);
        System.out.println(numbers.lastIndexOf(7));

        numbers.set(11, 9);
        System.out.println(numbers);

        numbers.remove(new Integer(1));
        System.out.println(numbers);


    }
}
