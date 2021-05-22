package pl.derela.wszib.spotkanie5.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo2 {

    public static void main(String[] args) {

     /*   List<Integer> integerList = new ArrayList<>();

        for (int i = 1; i < 101; i++) {
            integerList.add(i);
        }
        System.out.println(integerList);*/

        List<Integer> arrayList = new ArrayList<>(150);
        for (int i = 1; i <= 100; i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList);
        arrayList.removeIf(el -> el % 3 ==0);
        System.out.println(arrayList);


//        for (Integer element : arrayList) {
//            System.out.print(element + " ");
//        }



        /*Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Integer el = iterator.next();
            if (el % 3 == 0) {
                iterator.remove();
            }
        }*/
          /*  System.out.println(" ");
            for (Integer element : arrayList) {
                System.out.print(element + " ");
            }
        }*/

    }
}
