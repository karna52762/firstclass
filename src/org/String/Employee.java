package org.String;

public class Employee {
	public static void main(String[] args) {
// String refName = "value";
// index 0123456789...........n-1
		String s = "Welcome to java class";
		System.out.println("1." + s);

// To find the size of the string
		int length = s.length(); // s.length ctrl+2 --l (written type or data type)
		System.out.println("2." + length);

// To find the string is empty or not
		boolean empty = s.isEmpty();
		System.out.println("3." + empty);

// To find a character at a particular character
		char charAt = s.charAt(3);
		System.out.println("4." + charAt);

// To find index position of a particular character
		int indexOf = s.indexOf('e');// first occurrence(welcome)
		System.out.println("5." + indexOf);

		int lastIndexOf = s.lastIndexOf("e");
		System.out.println("6." + lastIndexOf);// last occurrence(welcome)

		int indexOf2 = s.indexOf('q');
		System.out.println("7." + indexOf2);

// To change the given string into Upper class
		String upperCase = s.toUpperCase();
		System.out.println("8." + upperCase);

// To change the given string into Lower class
		String lowerCase = s.toLowerCase();
		System.out.println("9." + lowerCase);

// To check status with a particular character
		boolean startsWith = s.startsWith("w"); // case sensitive capital(W)-->small(w)
		System.out.println("10." + startsWith);

		boolean endsWith = s.endsWith("s");// index end with class---> last letter is 's'
		System.out.println("11." + endsWith);

// To check a particular character is present in the string or not
		boolean contains = s.contains("Java"); // case sensitive capital(J)-->small(j)
		System.out.println("12." + contains);

// To replace a particular character
		String replace = s.replace("e", "#");
		System.out.println("12." + replace);

		String replaceAll = s.replaceAll("java", "Java");
		System.out.println(replaceAll);

// To get the particular value from String
		String substring = s.substring(8);
		System.out.println("13."+substring);

		String substring2 = s.substring(0,7);
		System.out.println("14."+substring2);

// To trim the unwanted Spaces
		String trim = s.trim();
		System.out.println("15."+trim);

// To spilit the string value
		String[] split = s.split(" ");
		for (String c : split) {
			System.out.println("16."+c);

		}
	}
}
