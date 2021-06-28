package com.java8Exercises.Java8;

interface StringRotate{
	public boolean isStringRotation(String s1,String s2);
}

public class StringRotation {
	static boolean rotationCheck(String s1, String s2) {  
		if (s1.length() != s2.length()) { 
			System.out.println(s2+" is not a String rotation of "+s1);
			return false; 
		}  
		String s3 = s1 + s1;  
		if (s3.contains(s2)) {
			System.out.println(s2+" is a String rotation of "+s1);
			return true;  
		}
		else  
			System.out.println(s2+" is not a String rotation of "+s1);
		return false;  
	} 
	public static void main(String[] args) {

		StringRotate sr=(s1,s2)->{
			if (s1.length() != s2.length()) {  
				System.out.println(s2+" is not a String rotation of "+s1);
				return false;  
			}  
			String s3 = s1 + s1;  
			if (s3.contains(s2)) {
				System.out.println(s2+" is a String rotation of "+s1);
				return true;  
			}
			else  
				System.out.println(s2+" is not a String rotation of "+s1);
			return false;  


		};
		sr.isStringRotation("hello","lohel");
		rotationCheck("santa","antab");
		
	}


}  

