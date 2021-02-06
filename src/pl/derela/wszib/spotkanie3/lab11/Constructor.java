package pl.derela.wszib.spotkanie3.lab11;

public class Constructor {

    public static void main(String[] args) {

        new A();
        System.out.println();
        new A(true);
        System.out.println();
        new A(false);
        System.out.println();
        System.out.println("===========");
        new B();
        System.out.println();
        new B(true);
        System.out.println();
        new B(false);
        System.out.println("==============");
        System.out.println();
        new C();
        System.out.println();
        new C(true);
        System.out.println();
        new C(false);


    }
}

class A {
    public A() {
        System.out.println("Konstruktor klasy A");
    }

    public A(boolean isTrue) {
       /* System.out.println("-");*/
        if (isTrue == false) {
            System.out.println("Bazowy A");
        } else if (isTrue == true) {
            System.out.println("Nic");}
    }

}

class B extends A {
    public B() {
        System.out.println("Konstruktor klasy B");
    }


    public B(boolean isTrue) {
        super(true);
      /*  System.out.println("-");*/

        if (isTrue==false) {

            System.out.println("Bazowy B");
        }else if (isTrue == true) {
            System.out.println("Nic");}
    }


    }



class C extends B {
    public C() {
        System.out.println("Konstruktor klasy C");
    }

    public C(boolean isTrue) {
        super(true);

       /* System.out.println("-");*/
        if (isTrue == false) {
            System.out.println("Bazowy C");
        }else if (isTrue == true) {
            System.out.println("Nic");}


    }

}