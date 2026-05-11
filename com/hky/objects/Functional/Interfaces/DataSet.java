package com.hky.objects.Functional.Interfaces;

import java.util.ArrayList;
import java.util.List;

public class DataSet {

    public static List<Student> getStudents()
    {
        List<Student> listOfStudents = new ArrayList<Student>();

        listOfStudents.add(new Student(111, "John", 81.0, "Mathematics",85));

        listOfStudents.add(new Student(222, "Harsha", 79.5, "History",78));

        listOfStudents.add(new Student(333, "Ruth", 87.2, "Computers",92));

        listOfStudents.add(new Student(444, "Aroma", 63.2, "Mathematics",65));

        listOfStudents.add(new Student(555, "Zade", 83.5, "Computers",88));

        listOfStudents.add(new Student(666, "Xing", 58.5, "Geography",60));

        listOfStudents.add(new Student(777, "Richards", 72.6, "Banking",70));

        listOfStudents.add(new Student(888, "Sunil", 86.7, "History",90));

        listOfStudents.add(new Student(999, "Jordan", 58.6, "Finance",55));

        listOfStudents.add(new Student(101010, "Chris", 89.8, "Computers",95));


        return listOfStudents;
    }
}
