package cmo.hky.java8code;

import java.util.*;
import java.util.stream.Collectors;

public class TestEmployee {
	private List<Employee> employeeList;

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));

		System.out.println("======How many male and female employees  are there in  this organization=======");
		Map<String,Long> noOfMaleFemaleEmployees=employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		System.out.println("noOfMaleFemaleEmployees::"+noOfMaleFemaleEmployees);
		System.out.println("=== Print the name of all departments in the organization?======");
		employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
		System.out.println("====What is the average age of male and female employees?=====");
		Map<String,Double>  avgAge=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
		employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));

		long count = employeeList.stream()
				.map(Employee::getDepartment).distinct()
				.count();
		System.out.println("count:" + count);
		System.out.println("avgAge::"+avgAge);
		System.out.println("Get the details of highest paid employee in the organization?");
		Optional<Employee> maxSalary = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));

		System.out.println("maxSalary:"+maxSalary);
		Optional<Employee> empOld =
				employeeList.stream()
						.max(Comparator.comparing(Employee::getAge
		));
		Optional<Employee> empYoungest = employeeList.stream().min(Comparator.comparing(Employee::getAge
		));
		Optional<Employee> empYoung = employeeList.stream().min(Comparator.comparing(Employee::getAge
		));
//       Optional<Employee> emp=employeeList.stream().max(Comparator.comparing(Employee::getAge));
		System.out.println("oldest::" + empOld);
		System.out.println("empYoungest::" + empYoungest + "----" + empYoung);
		System.out.println("========================== ====================================");
		employeeList.stream().sorted(Comparator.comparing(Employee::getSalary)).limit(3).forEach(System.out::println);
		System.out.println("==============================================================");
		List<Employee> topHighesy = employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(3).collect(Collectors.toList());
	    topHighesy.forEach(System.out::println);
		System.out.println("==============================================================");
		employeeList.stream().filter(e->e.getSalary()>5000&& e.getName().startsWith("M")).forEach(e-> System.out.println("salary::"+e.gender));
		employeeList.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
	    employeeList.stream().filter(e->e.getSalary()>5000 && e.getSalary()<30000).findFirst().ifPresent(e->System.out.println("findFirst:"+e));
		employeeList.stream().filter(e->e.getSalary()>5000 && e.getSalary()<30000).mapToDouble(e->e.getSalary()).findFirst().ifPresent(e->System.out.println("findFirst:"+e));
         //employeeList.stream().
		employeeList.stream().filter(e -> e.getSalary() > 500).forEach(employee -> System.out.println(employee.getName()));
       Map<Boolean, List<Employee>> ageGroup=employeeList.stream().collect(Collectors.groupingBy(e->e.getSalary()>100000));
       System.out.println("ageGroup::"+ageGroup);

	   employeeList.stream().filter(e->e.getSalary()>=20000 && e.getSalary()<=40000).mapToDouble(e->e.getSalary()).findFirst().ifPresent(e-> System.out.println("Salary between 20000 to 40000::"+e));
	}


}
