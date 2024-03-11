package pl.pp;

public class Person {
    private String forename;
    private String surname;
    private int age;

    public Person() {
    }

    public Person(String forename, String surname, int age) {
        this.forename = forename;
        this.surname = surname;
        this.age = age;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void hiToAll() {
        System.out.println("My name is " + forename + " " + surname + ". " + "I am " + age + " years old.");
    }

    public int growOld() {
        age = age + 1;
        return age;
    }

    public String getName() {
        return forename + " " + surname;
    }

    public void setName(String name) {
        String[] names = name.split(" ", 2);
        this.forename = names[0];
        if (names.length > 1) {
            this.surname = names[1];
        }
    }
}
