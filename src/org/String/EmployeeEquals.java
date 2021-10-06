package org.String;

public class EmployeeEquals {
public static void main(String[] args) {
	String s="Welcome to java class";
	System.out.println(s);
	String s1="welcome to java class";
	
	//To compare two string and both are equal in case 
	
	boolean equals = s.equals(s1);
	System.out.println(equals);
	
	//To compare two string,not case sensitive
	
	boolean equalsIgnoreCase = s.equalsIgnoreCase(s1);
	System.out.println(equalsIgnoreCase);
	
	
	
	
	
	
}
}
