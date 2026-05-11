package com.hky.objects.Functional.Interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionTest {
    public static void main(String[] args) {
        Predicate<Student> mathematicsPredicate = (Student student) -> student.getSpecialization().equals("Mathematics");

        List<Student> mathematicsStudents = new ArrayList<Student>();
        var listOfStudents = DataSet.getStudents();

        for (Student student : listOfStudents) {
            if (mathematicsPredicate.test(student)) {
                mathematicsStudents.add(student);
            }
        }
        System.out.println("Mathematics Students:");
        for (Student student : mathematicsStudents) {
            System.out.println(student);
        }

        Consumer<Student> percentageConsumer = (Student student) -> {
            System.out.println(student.getName() + " : " + student.getPercentage());


        };

        System.out.println("\nStudents with percentage greater than 80:");
        for (Student student : listOfStudents) {
            if (student.getPercentage() > 80) {
                percentageConsumer.accept(student);

            }
        }
    }





}