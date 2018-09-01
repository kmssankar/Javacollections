package org.javacollections.treeset.implementations;

import java.util.TreeSet;

public class TreesetFunctions {
	
	public void addtoTreeset (TreeSet<Accounts> TSInp , Accounts Acc )
	{
		TSInp.add(Acc);
	}
	
	public void displayTreeset (TreeSet<Accounts> TSDis)
	{
		for(Accounts Acc : TSDis)
			{
				System.out.println(Acc);
			}
	}
	
}
