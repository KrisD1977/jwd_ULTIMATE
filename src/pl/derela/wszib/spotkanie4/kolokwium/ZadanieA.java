package pl.derela.wszib.spotkanie4.kolokwium;

public class ZadanieA {

    public int x;
   public  boolean isTrue;

    @Override
    public String toString() {
        return "ZadanieA dla liczby " + x  +
                ", parzystość = {" + isTrue +
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

        a.x =55;

        a.showTrue();
        System.out.println(a);


    }

}


