package com.java8Exercises.Java8;

import java.util.*;

public class ReverseSortEmployeeName implements Comparator <Employee> {
	public static void main(String [] args) {
	


	TreeSet<Employee> revSortEmpbyName = new TreeSet<Employee>();
	revSortEmpbyName = new TreeSet<>(new ReverseSortEmployeeName());

	revSortEmpbyName.add(new Employee("Aman", 25, 25000));
	revSortEmpbyName.add(new Employee("Yash", 31, 28000));
	revSortEmpbyName.add(new Employee("Aakash",23, 20000));
	System.out.println(revSortEmpbyName);
	}

	@Override
	public int compare(Employee e1, Employee e2) {
		return -(e1.getname()).compareTo(e2.getname());
	}



	}



