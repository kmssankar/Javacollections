package org.javalegacy.collections;

import java.util.Enumeration;
import java.util.Stack;

public class LegacyStackMain {

	public static void main(String[] args) {
		Stack<String> stackin = new Stack<String>();
		stackin.push("Hadoop");
		stackin.push("Spark");
		stackin.push("Cassendra");
		
		Enumeration<String> enm = stackin.elements();
		while(enm.hasMoreElements())System.out.println(enm.nextElement());

		System.out.println("Element @ 1 " + stackin.elementAt(1));
		System.out.println("Stack Size  " +stackin.size());
		System.out.println("Stack Peek  " + stackin.peek());
		System.out.println("Search Spark  "+stackin.search("Spark"));
	}
	
	/*OUTPUT
	Hadoop
	Spark
	Cassendra
	Element @ 1 Spark
	Stack Size  3
	Stack Peek  Cassendra
	Search Spark  2*/

}
