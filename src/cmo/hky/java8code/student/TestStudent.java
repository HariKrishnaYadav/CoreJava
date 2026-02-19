package cmo.hky.java8code.student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestStudent {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student(1, "Mahesh", 12));
        list.add(new Student(2, "Suresh", 15));
        list.add(new Student(3, "Nilesh", 10));
        System.out.println("---Natural Sorting by Name---");
      List<Student>  studentList=list.stream().sorted().collect(Collectors.toList());
        studentList.stream().forEach(e-> System.out.println("Id:"+e.getId()+"--"+"Name:"+e.getName()+"--"+"Age:"+e.getAge()));
        System.out.println("---Natural Sorting by Name in reverse order---");
        List<Student>  studentList1=list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        studentList1.stream().forEach(e-> System.out.println("Id:"+e.getId()+"--"+"Name:"+e.getName()+"--"+"Age:"+e.getAge()));

        System.out.println("---Sorting using Comparator by Age---");
        List<Student>    studentList2 = list.stream().sorted(Comparator.comparing(Student::getAge).reversed()).limit(2).skip(1).collect(Collectors.toList());
          studentList2.forEach(e -> System.out.println("Id:"+ e.getId()+", Name: "+e.getName()+", Age:"+e.getAge()));

    }
}
