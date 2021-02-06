package pl.derela.wszib.spotkanie1;

public class FamilyMemberApp {

    public static void main(String[] args) {

        FamilyMember dad = new FamilyMember();
        FamilyMember mum = new FamilyMember();
        FamilyMember son = new FamilyMember();

        dad.name = "Jan";
        mum.name = "Anna";
        son.name = "Tomasz";
        dad.age = 50;
        mum.age = 44;
        son.age = 15;



        System.out.println("Tata to  " + dad.name + " " + FamilyMember.surname + " i ma " + dad.age + " lat.");
        System.out.println("Mama to  " + mum.name + " " + FamilyMember.surname + " i ma " + mum.age + " lat.");
        System.out.println("Syn to  " + son.name + " " + FamilyMember.surname + " i ma " + son.age + " lat.");

        FamilyMember.surname = "Kowalski";
        System.out.println();
        System.out.println("Tata to  " + dad.name + " " + FamilyMember.surname + " i ma " + dad.age + " lat.");
        System.out.println("Mama to  " + mum.name + " " + FamilyMember.surname + " i ma " + mum.age + " lat.");
        System.out.println("Syn to  " + son.name + " " + FamilyMember.surname + " i ma " + son.age + " lat.");

        dad.surname = "Baran";
        System.out.println();
        System.out.println("Tata to  " + dad.name + " " + FamilyMember.surname + " i ma " + dad.age + " lat.");
        System.out.println("Mama to  " + mum.name + " " + FamilyMember.surname + " i ma " + mum.age + " lat.");
        System.out.println("Syn to  " + son.name + " " + FamilyMember.surname + " i ma " + son.age + " lat.");


    }
}
