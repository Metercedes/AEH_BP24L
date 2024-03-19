package pl.pp;

public class mySeventhApp {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.hiToAll();

        person1.forename = "John";
        person1.surname = "Doe";
        person1.age = 24;
        person1.address = "123 Main St";
        person1.yearOfBirth = 2000;
        person1.hiToAll();

        Person person2 = new Person("Alice", "Hart", 42, "456 Elm St", 1978);
        person2.hiToAll();

        person1.growOld(1);
        for(int i=0; i<3; i++) {
            person2.growOld(1);
        }

        person1.hiToAll();
        person2.hiToAll();

        System.out.println(person1.getName());
        person1.setName("Lolo");
        System.out.println(person1.getName());
        person1.hiToAll();

        person1.beYounger();
        person2.beYounger();

        person1.hiToAll();
        person2.hiToAll();
    }
}
