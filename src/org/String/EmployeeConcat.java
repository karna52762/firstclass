package org.String;

public class EmployeeConcat {
	public static void main(String[] args) {
		String s="Welcome to java class";
		System.out.println(s);
    String s1="Hi";
    System.out.println(s);
    
    //Join the two string
    
    String concat = s1.concat(s);
    System.out.println(concat );
}
}