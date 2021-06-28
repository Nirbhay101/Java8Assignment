package com.java8Exercises.Java8;

import java.util.*;

interface ReverseList{
	public List<Integer> revList(Integer [] a);
}

public class Reverse {
 static List<Integer> ReverseList(Integer [] a) { 
	 List<Integer> values= Arrays.asList(a);
	 values.sort(Comparator.reverseOrder());
	 System.out.println("List in reverse order: "+values);
	 return values;
 }
 
 public static void main(String [] args) {
	 
	 ReverseList rl=(Integer [] a)->{
		 List<Integer> values= Arrays.asList(a);
		 values.sort(Comparator.reverseOrder());
		 System.out.println("List in reverse order using lambda: "+values);
		 return values;
	 };
	 Integer numArray1[]={11,62,5,6,37,2}; 
	 Integer numArray2[]={24,36,59,27,73,52,55}; 
	 rl.revList(numArray1);
	 ReverseList(numArray2);
 }
}
