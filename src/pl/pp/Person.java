package pl.pp;

public class Person {
    public String forename;
    public String surname;
    public int age;
    public String address;
    public int yearOfBirth;

    public Person() {

    }

    public Person(String initForename, String initSurname, int initAge, String initAddress, int initYearOfBirth) {
        forename = initForename;
        surname = initSurname;
        age = initAge;
        address = initAddress;
        yearOfBirth = initYearOfBirth;
    }

    public void hiToAll(){
        System.out.println("My name is " + forename + " " + surname + ". I am " + age + " years old. I live at " + address + ".");
    }

    public void growOld(int years){
        age += years;
    }

    public void beYounger(){
        age -= 1;
    }

    public String getName(){
        return forename;
    }

    public void setName(String nameToSet){
        forename = nameToSet;
    }
}
