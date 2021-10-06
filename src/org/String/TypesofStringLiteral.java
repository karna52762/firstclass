package org.String;

public class TypesofStringLiteral {
	public static void main(String[] args) {
		System.out.println("Literal String");

		String s = "java";
		System.out.println(s);
		int x = System.identityHashCode(s);
		System.out.println(x);

		String s1 = "Java";
		System.out.println(s1);
		int y = System.identityHashCode(s1);
		System.out.println(y);

		String s2 = "Java";
		System.out.println(s2);
		int z = System.identityHashCode(s2);
		System.out.println(z);

		System.out.println("*************************************************");
		System.out.println("Non Literal String");

		String ns = new String("Python");
		System.out.println(ns);
		int p = System.identityHashCode(ns);
		System.out.println(p);

		String ns1 = new String("python");
		System.out.println(ns1);
		int q = System.identityHashCode(ns1);
		System.out.println(q);

		String ns2 = new String("Selenium");
		System.out.println(ns2);
		int r = System.identityHashCode(ns2);
		System.out.println(r);
	
		
		
	
	
	
	
	
	
	
	
	
	
	}
}
