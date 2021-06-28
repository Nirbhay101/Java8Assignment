package com.java8Exercises.Java8;

import java.util.*;

public class Employee implements Comparable<Employee>{
	
	private String name;
    private int age;
    private int salary;
 
    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public String getname() {
    	return name;
    }
    public int getage() {
    	return age;
    }
    public int getsalary() {
    	return salary;
    }
    @Override
    public String toString() {
        return "["+this.name+","+this.age+","+this.salary+"]"; 
    }
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.age - o.age;}

		
	
    
}