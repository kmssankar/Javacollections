package org.javacollections.treeset.implementations;

import java.util.TreeSet;

public class Treesetmain {

	public static void main(String[] args) {
		TreeSet<Accounts> AccTS = new TreeSet<Accounts>();
		TreesetFunctions TSF = new TreesetFunctions();
		TSF.addtoTreeset(AccTS,new Accounts(12,"John","Savings"));
		TSF.addtoTreeset(AccTS,new Accounts(14,"Jack","Savings"));
		TSF.addtoTreeset(AccTS,new Accounts(9,"Daniels","Savings"));
		// Display
		TSF.displayTreeset(AccTS);
		System.out.println(" Using For Each ");
		AccTS.forEach(System.out::println);
	}

}
