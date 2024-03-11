package pl.pp;

import java.util.*;

public class myEleventhapp {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("12345", "Jan", "Kowalski", Arrays.asList(4, 5, 3, 5)),
                new Student("67890", "Anna", "Nowak", Arrays.asList(5, 5, 4, 4)),
                new Student("54321", "Paweł", "Wiśniewski", Arrays.asList(3, 2, 4)),
                new Student("09876", "Katarzyna", "Kowalczyk", Arrays.asList(5, 4, 4, 5))
        );

        students.stream()
                .max(Comparator.comparingDouble(Student::calculateAverage))
                .ifPresent(topStudent -> System.out.println("Student with the highest average: " + topStudent));

        students.sort(Comparator.comparing(Student::getLastName));

        System.out.println("Students sorted by last name:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
