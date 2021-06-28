package com.java8Exercises.Java8;

import java.util.*;


public class SortEmployeeName {
	
    public static void main(String [] args) {

	    List<Employee> employees  = new ArrayList<>();
	    employees.add(new Employee("Yash", 25, 25000));
	    employees.add(new Employee("Aman", 31, 28000));
	    employees.add(new Employee("Aakash",23, 20000));
	    System.out.println(employees);
	
employees.sort(Comparator.comparing(e->e.getname()));
System.out.println(employees);
}
}
	 
	