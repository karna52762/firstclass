package org.String;

public class TypesofStringMutable {
	public static void main(String[] args) {
		String s="hi";
		System.out.println(s);
		int x = System.identityHashCode(s);
		System.out.println(x);
		
		String s1="welcome to java";
		System.out.println(s1);
		int y = System.identityHashCode(s1);
		System.out.println(y);
		
		String concat = s.concat(s1);
		System.out.println(System.identityHashCode(concat));
		
		System.out.println("*******************************************");
		
		System.out.println("Mutable String");
		StringBuffer ns= new StringBuffer();
		int p = System.identityHashCode(ns);
		System.out.println(p);
		
		StringBuffer ns1=new StringBuffer();
		int q = System.identityHashCode(ns1);
		System.out.println(q);
		
		
	    StringBuffer append=ns.append(ns1);
	    System.out.println(append);
	    System.out.println(System.identityHashCode(append));
	    
		
	}

}
