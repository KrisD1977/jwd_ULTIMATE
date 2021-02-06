package pl.derela.wszib.spotkanie2;

public class MultiDArrays {
    public static void main(String[] args) {

        int [][] multiDimArr = {{1,2,2,3,2},{3,4}};

        int[] arr = {1,2,3,4,5,6,7,8};

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr [" + i + "] = " + arr[i]);

        }

        /*for (int i : arr) {
            System.out.println(i);
        };*/

        for (int i = 0; i < multiDimArr.length; i++) {
            for (int j = 0; j < multiDimArr[i].length; j++) {
                System.out.println("multiDimArr [" + i + "] [" + j + "] = " + multiDimArr [i] [j]);

            }

        }

    }
}
