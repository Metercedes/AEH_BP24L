package pl.pp;

import java.util.*;

class Student {
    private String indexNumber;
    private String firstName;
    private String lastName;
    private List<Integer> grades;

    public Student(String indexNumber, String firstName, String lastName, List<Integer> grades) {
        this.indexNumber = indexNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = new ArrayList<>(grades);
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Integer> getGrades() {
        return new ArrayList<>(grades);
    }

    public double calculateAverage() {
        return grades.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + indexNumber + ") - Average: " + String.format("%.2f", calculateAverage());
    }
}
