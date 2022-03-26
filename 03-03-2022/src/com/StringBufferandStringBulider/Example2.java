package com.StringBufferandStringBulider;

public class Example2 {

	public static void main(String[] args) {
		// StringBuffer and StringBuilder are Mutable
		StringBuffer name=new StringBuffer("Varshini");
		name.append(" Devi");
		System.out.println(name);
		System.out.println("**************");
		StringBuilder myName=new StringBuilder("Seethala");
		myName.append(" Devi");
		System.out.println(myName);
		

	}

}
