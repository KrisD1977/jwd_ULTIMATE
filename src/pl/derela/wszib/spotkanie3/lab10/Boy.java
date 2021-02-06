package pl.derela.wszib.spotkanie3.lab10;

public class Boy extends Human {

    public void eat() {
        System.out.println("Boy is eating.");
    }

    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.eat();
        Human human = new Human();
        human.eat();
        Human dedek = new Boy();
        System.out.println(dedek.getClass().getName());
        dedek.eat();


    }
}
