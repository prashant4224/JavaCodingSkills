package com.javahungry.icompass;

import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.List;

public class Employee {

	
	private int id;
	private String name;
	private int age;
	private long salary;
	
	
	public Employee(int id, String name, int age, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}



	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();

		Employee e1 = new Employee(10, "Mikey", 25, 10000);
		Employee e2 = new Employee(20, "Arun", 29, 20000);
		Employee e3 = new Employee(5, "Lisa", 35, 5000);
		Employee e4 = new Employee(15, "Sara", 35, 5000);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		for (Employee emp : list) {
//			list.add(e4);
			emp.id = 5;
		}
		
		for (Employee employee : list) {
			System.out.println(employee);
		}
		
		
		LocalDate id = LocalDate.of(2016, 2, 29);
		id = id.withYear(2015);
		System.out.println(id);
		
		int array[][] = new int[2][];
//		array[0][0] = 0;
//		array[0][1] = 1;
//		array[0][2] = 2;
//		
//		array[1][0] = 0;
//		array[1][1] = 10;
//		array[1][2] = 20;
//		
		System.out.println(array);
		System.out.println(array[0]);		
//		System.out.println(array[1][1]);
		
		Instant ins = Instant.parse("2007-12-03T10:15:24.00Z");
		System.out.println(ins);
//		ins = ins.plusMillis(17000);
//		ins = ins.plusMillis(16999);
		ins = ins.plusMillis(4000);
		System.out.println(ins);
		System.out.println(ins.get(ChronoField.MILLI_OF_SECOND));
		
		// create a Instant object 
        Instant instant = Instant.parse("2018-12-30T19:34:50.63Z"); 
  
        // get Mili of Second value from instant 
        // using get method 
        int secondvalue = instant.get(ChronoField.MILLI_OF_SECOND); 
  
        // print result 
        System.out.println("MiliSecond Field: " + secondvalue); 
		
		}

}
