package com.hky.interview;

public class Employee {

    private Long id;
    private String name;
    private String department;
    private String gender;
    private Integer age;
    private Double salary;
    private String city;
    private Integer yearOfJoining;
    private Boolean active;

    public Employee(Long id, String name, String department, String gender,
                    Integer age, Double salary, String city,
                    Integer yearOfJoining, Boolean active) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
        this.city = city;
        this.yearOfJoining = yearOfJoining;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getGender() {
        return gender;
    }

    public Integer getAge() {
        return age;
    }

    public Double getSalary() {
        return salary;
    }

    public String getCity() {
        return city;
    }

    public Integer getYearOfJoining() {
        return yearOfJoining;
    }

    public Boolean getActive() {
        return active;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", city='" + city + '\'' +
                ", yearOfJoining=" + yearOfJoining +
                ", active=" + active +
                '}';
    }

}