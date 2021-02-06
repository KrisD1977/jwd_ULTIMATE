package pl.derela.wszib.spotkanie3;

public class EmployeeTester {

    public static void main(String[] args) {

        Employee a = new Employee("Kowalski ",22,3400);
        Employee b = new Employee("Kowalski ",22,3400);
        Employee c = new Employee("Kowalski ",22,3500);

        System.out.println("a == b : " + (a==b));
        System.out.println("a.equals(b) : " + (a.equals(b)));


        String s1 = new String("napis");
        String s2 = new String("napis");

        System.out.println("s1 == s2 : " + (a==b));
        System.out.println("s1.equals(s2) : " + (a.equals(b)));


    }
}
