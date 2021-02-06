package pl.derela.wszib.spotkanie1.lab4;

public class Employees  {

    String firstName;
    String lastName;
    short age;
    char gender;
    int iD;

    @Override
    public String toString() {
        return "Pracownik{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", iD=" + iD +
                '}';
    }

    public Employees(String firstName, String lastName, short age, char gender, int iD) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.iD = iD;


    }

    public static void main(String[] args) {

        Employees kowalski = new Employees("Jan","Kowalski", (short) 32,'m',1265442);
        System.out.println(kowalski);

        Employees nowak = new Employees("Janusz","Nowak", (short) 51,'m',1235446);
        nowak.age = 45;
        System.out.println(nowak);

        Employees smith = new Employees("John", "Smith", (short) 35,'m',1245663);
        System.out.println(smith);

    }
}
