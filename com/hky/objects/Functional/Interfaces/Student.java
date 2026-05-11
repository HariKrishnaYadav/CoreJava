package com.hky.objects.Functional.Interfaces;

class Student
{
    int id;

    String name;


    double percentage;

    String specialization;

    int marks;

    public Student(int id, String name, double percentage, String specialization, int marks)
    {
        this.id = id;

        this.name = name;

        this.percentage = percentage;

        this.specialization = specialization;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPercentage() {
        return percentage;
    }

    public String getSpecialization() {
        return specialization;
    }
    public int getMarks() {
        return marks;
    }
    public int setMarks(int marks) {
        return this.marks = marks;
    }

    @Override
    public String toString()
    {
        return id+"-"+name+"-"+percentage+"-"+specialization+"-"+marks;
    }
}
