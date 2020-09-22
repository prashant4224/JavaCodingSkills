package com.javaconceptoftheday;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.util.comparator.Comparators;

public class Employee
{
    int id;
     
    String name;
     
    int age;
     
    String gender;
     
    String department;
     
    int yearOfJoining;
     
    double salary;
     
    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) 
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }
     
    public int getId() 
    {
        return id;
    }
     
    public String getName() 
    {
        return name;
    }
     
    public int getAge() 
    {
        return age;
    }
     
    public String getGender() 
    {
        return gender;
    }
     
    public String getDepartment() 
    {
        return department;
    }
     
    public int getYearOfJoining() 
    {
        return yearOfJoining;
    }
     
    public double getSalary() 
    {
        return salary;
    }
     
    @Override
    public String toString() 
    {
        return "Id : "+id
                +", Name : "+name
                +", age : "+age
                +", Gender : "+gender
                +", Department : "+department
                +", Year Of Joining : "+yearOfJoining
                +", Salary : "+salary;
    }
    
    public static void main(String[] args) {
    	List<Employee> employeeList = new ArrayList<Employee>();
        
    	employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
    	employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
    	employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
    	employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
    	employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
    	employeeList.add(new Employee(166, "Raviraj medega", 43, "Male", "Security And Transport", 2016, 10500.0));
    	employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
    	employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
    	employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
    	employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
    	employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
    	employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
    	employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
    	employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
    	employeeList.add(new Employee(255, "Murgendra Havina", 23, "Male", "Infrastructure", 2018, 12700.0));
    	employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
    	employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));   	
    	
    	/*
    	 * Query 3.1 : How many male and female employees are there in the organization?
    	 * Query 3.2 : Print the name of all departments in the organization?
    	 * Query 3.3 : What is the average age of male and female employees?
    	 * Query 3.4 : Get the details of highest paid employee in the organization?
    	 * Query 3.5 : Get the names of all employees who have joined after 2015?
    	 * Query 3.6 : Count the number of employees in each department?
    	 * Query 3.7 : What is the average salary of each department?
    	 * Query 3.8 : Get the details of youngest male employee in the product development department?
    	 * Query 3.9 : Who has the most working experience in the organization?
    	 * Query 3.10 : How many male and female employees are there in the sales and marketing team?
    	 * Query 3.11 : What is the average salary of male and female employees?
    	 * Query 3.12 : List down the names of all employees in each department?
    	 * Query 3.13 : What is the average salary and total salary of the whole organization?
    	 * Query 3.14 : Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
    	 * Query 3.15 : Who is the oldest employee in the organization? What is his age and which department he belongs to?
    	 */    	
    	Map<String, Long> emp1 = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
    	System.out.println(emp1);
    	
    	List<String> emp2 = employeeList.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());
    	System.out.println(emp2);
    	
    	Map<String, Double> emp3 = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge)));
    	System.out.println(emp3);
    	
    	Optional<Employee> emp4 = employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
    	System.out.println(emp4.get());
    	
    	List<String> emp5 = employeeList.stream().filter(e -> e.getYearOfJoining() > 2015).map(Employee::getName).collect(Collectors.toList());
    	System.out.println(emp5);
    	
    	Map<String, Long> emp6 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
    	System.out.println(emp6);
    	
    	Map<String, Double> emp7 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
    	System.out.println(emp7);
    	
    	Optional<Employee> emp8 = employeeList.stream().filter(e -> e.getDepartment().equals("Product Development") && e.getGender().equals("Male")).min(Comparator.comparingInt(Employee::getAge));
    	System.out.println(emp8.get());
    	
    	Optional<Employee> emp9 = employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
    	System.out.println("emp9 "+emp9.get());
    	
    	Map<String, Long> emp10 = employeeList.stream().filter(e -> e.getDepartment()=="Sales And Marketing").collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
    	System.out.println(emp10);
    	
    	Map<String, Double> emp11 = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
    	System.out.println(emp11);
    	
    	Map<String, List<Employee>> emp12 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
//    	employeeList.stream().map(Employee::getName).forEach(System.out::println);;
//    	System.out.println(emp12);
    	for (Map.Entry<String, List<Employee>> deptwise : emp12.entrySet()) {
			System.out.println(deptwise.getKey());
			System.out.println("---------------");
    		for (Employee emp : deptwise.getValue()) {
				System.out.println(emp.getName());
			}
    		System.out.println("---------------");
		}
    	
    	DoubleSummaryStatistics emp13 = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
    	System.out.println(emp13.getAverage());
    	
    	System.out.println(emp13.getSum());
    	
    	Map<Boolean, List<Employee>> emp14 = employeeList.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 25));
    	Set<Entry<Boolean, List<Employee>>> partition = emp14.entrySet();
    	for (Entry<Boolean, List<Employee>> entry : partition) {
			
    		if (entry.getKey()) {
    			System.out.println("Age is greater than 25 ");
    		} else {
    			System.out.println("Age is lesser than  or equal to 25 ");
    		}
    		
    		for (Employee entry2 : entry.getValue()) {
				System.out.println(entry2);
			}
			
		}    	
    	
    	Optional<Employee> emp15 = employeeList.stream().max(Comparator.comparingInt(Employee::getAge));
    	System.out.println("Name: "+emp15.get().name + " Age: "+emp15.get().age+" Dept: "+emp15.get().department);
	}
    
}