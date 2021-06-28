package com.java8Exercises.Java8;
interface Palindrome{
	public boolean isPalindrome(String test);
}

public class TestPalindrome {

	static boolean stringPalindrome(String test) {
		StringBuilder reverseString=new StringBuilder(test);
		reverseString.reverse();
		String rev=reverseString.toString();
		if(test.equals(rev)){ 
			System.out.println(test+" is palindrome");
			return true;  
		}else{  
			System.out.println(test+" is not palindrome");
			return false;  
		} 
	}


	public static void main (String[] args) {
		Palindrome pal1=(test)->{
			StringBuilder reverseString=new StringBuilder(test);
			reverseString.reverse();
			String rev=reverseString.toString();
			if(test.equals(rev)){ 
				System.out.println(test+" is palindrome");
				return true;  
			}else{  
				System.out.println(test+" is not palindrome");
				return false;  
			}  };

			pal1.isPalindrome("rar");
			stringPalindrome("santa");
	}
}