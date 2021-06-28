package com.java8Exercises.Java8;

import java.util.TreeSet;

interface sortTree{
	public TreeSet<Integer> treeSetSort(TreeSet <Integer> sort);
}

public class sortTreeSet {
	static TreeSet<Integer> treeSortWithoutLambda(TreeSet <Integer> tree){
		TreeSet<Integer> revTree =
				(TreeSet<Integer>)tree.descendingSet();
		System.out.println("Without Reversing Order: " +
				tree);
		System.out.println("With Reversing Order: " +
				revTree);
		return revTree;
	}

	public static void main (String[] args) {

		sortTree st=(TreeSet <Integer> sort)->{

			TreeSet<Integer> intReverse =
					(TreeSet<Integer>)sort.descendingSet();
			System.out.println("Without Reversing Order using lambda: " +
					sort);
			System.out.println("With Reversing Order using lambda: " +
					intReverse);
			return intReverse;
		};
		
		TreeSet<Integer> sort1 = new TreeSet<Integer>();
		sort1.add(7);
		sort1.add(13);
		sort1.add(2);
		sort1.add(5);
		st.treeSetSort(sort1);
		treeSortWithoutLambda(sort1);
	}

}
