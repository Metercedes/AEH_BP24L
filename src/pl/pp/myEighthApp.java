package pl.pp;

public class myEighthApp {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.hiToAll();

        person1.setForename("John");
        person1.setSurname("Doe");
        person1.setAge(24);
        person1.hiToAll();

        Person person2 = new Person("Alice", "Hart", 42);
        person2.hiToAll();

        person1.growOld();
        for(int i=0; i<3; i++) {
            person2.growOld();
        }
        person1.hiToAll();
        person2.hiToAll();

        System.out.println(person1.getName());
        person1.setName("Lolo");
        System.out.println(person1.getName());
        person1.hiToAll();

        Circle circle = new Circle(5.0);
        circle.getInfo();

        Account account = new Account("1234567890", 1000.0, "John Doe", "john.doe@example.com", "123456789");
        account.credit(900.0);
        account.withdraw(900.0);
        account.credit(250.0);
        account.withdraw(50.0);
    }
}
