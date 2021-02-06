package pl.derela.wszib.spotkanie2.lab8;

public class Array3D {
    public static void main(String[] args) {

        int[][][] arr = { { {1,2,3},{5}}, {{1},{}} ,{{6},{7}}   };

        System.out.println("arr [0] [0] [0] = " + arr[0][0][0]);
        System.out.println("arr [0] [0] [1] = " + arr[0][0][1]);
        System.out.println("arr [0] [0] [2] = " + arr[0][0][2]);
        System.out.println("arr [0] [1] [0] = " + arr[0][1][0]);
        System.out.println("arr [1] [0] [0] = " + arr[1][0][0]);
        System.out.println("arr [2] [0] [0] = " + arr[2][0][0]);
        System.out.println("arr [2] [1] [0] = " + arr[2][1][0]);
        System.out.println("---------------------------------");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.println("arr [" +i + "] [" + j + "] [" +k +"] = " + arr [i][j][k] );

                }

            }

        }





    }
}
