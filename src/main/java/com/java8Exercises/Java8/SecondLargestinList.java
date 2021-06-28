package com.java8Exercises.Java8;

import java.util.*;
interface SecondLargest{
	public int secondLarge(Integer[] a);
}

public class SecondLargestinList {
	static int getSecondLargest(Integer[] a){  
		int listSize;
		List<Integer> list=Arrays.asList(a);
		listSize=list.size();
		Collections.sort(list);  
		int element=list.get(listSize-2);  
		System.out.println("Second Larget Element= "+element);
		return element;   
		}  
	
	public static void main (String[] args) {
		SecondLargest sl=(Integer[] a)->{
			int listSize;
			List<Integer> list=Arrays.asList(a);
			listSize=list.size();
			Collections.sort(list);  
			int element=list.get(listSize-2);  
			System.out.println("Second Larget Element= "+element);
			return element;   
		};
		Integer numArray1[]={11,62,5,6,37,2}; 
		Integer numArray2[]={24,36,59,27,73,52,55}; 
		sl.secondLarge(numArray1);
		getSecondLargest(numArray2);
		
	}

}
