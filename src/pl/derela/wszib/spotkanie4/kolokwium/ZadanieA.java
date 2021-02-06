package pl.derela.wszib.spotkanie4.kolokwium;

public class ZadanieA {

    public int x;
   public  boolean isTrue;

    @Override
    public String toString() {
        return "ZadanieA{" +
                "isTrue=" + isTrue +
                '}';
    }

    public  void  showTrue () {

        if ((x % 2 == 0)) {
            isTrue = true;

        } else {
            isTrue = false;

        }

    }

    public static void main(String[] args) {

        ZadanieA a = new ZadanieA();

        a.x =11;

        a.showTrue();
        System.out.println(a);


    }

}


