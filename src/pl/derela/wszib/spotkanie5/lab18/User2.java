package pl.derela.wszib.spotkanie5.lab18;

import java.util.Objects;

public class User2 {
    private String firstname;
    private String lastname;
    private int age;

    public User2(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User2 user2 = (User2) o;
        return age == user2.age && Objects.equals(firstname, user2.firstname) && Objects.equals(lastname, user2.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, age);
    }

    @Override
    public String toString() {
        return   firstname + " "+ lastname +" "  + age ;
    }
}
