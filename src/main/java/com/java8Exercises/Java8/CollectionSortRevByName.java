package com.java8Exercises.Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSortRevByName {
	public static void main(String[] args) {
	       List < Employee > employees = new ArrayList < Employee > ();
	        employees.add(new Employee("Rajeev", 25, 25000));
	        employees.add(new Employee("Santosh", 31, 28000));
	
    Collections.sort(employees, (o1, o2) -> (o2.getname().compareTo(o1.getname())));
    System.out.println(employees);

}}
