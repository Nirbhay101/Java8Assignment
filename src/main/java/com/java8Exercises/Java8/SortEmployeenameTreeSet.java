package com.java8Exercises.Java8;

import java.util.*;

public class SortEmployeenameTreeSet  {
	public static void main(String [] args) {
		TreeSet<Employee> sortEmpbyName = new TreeSet<Employee>();


		sortEmpbyName = new TreeSet<>(Comparator.comparing(e->e.getname()));
		sortEmpbyName.add(new Employee("Yash", 25, 25000));
		sortEmpbyName.add(new Employee("Aman", 31, 28000));
		sortEmpbyName.add(new Employee("Aakash",23, 20000));
		System.out.println("Sorted Employees "+sortEmpbyName);

	}


}
