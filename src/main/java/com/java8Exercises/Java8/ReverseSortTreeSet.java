package com.java8Exercises.Java8;

import java.util.*;

interface revSortTree{
	public TreeSet<Integer> treeSetSort(TreeSet <Integer> sort);
}

public class ReverseSortTreeSet {

	public static void main(String [] args) {

		revSortTree rs=(sort)->{
			sort = (TreeSet<Integer>) sort.descendingSet();
			System.out.println("TreeSet contains: " + sort);
			return sort;
		};

		TreeSet<Integer> tSetNumbers = new TreeSet<Integer>();

		tSetNumbers.add(7);
		tSetNumbers.add(3);
		tSetNumbers.add(9);
		tSetNumbers.add(5);
		tSetNumbers.add(1);
		rs.treeSetSort(tSetNumbers);

	}
}