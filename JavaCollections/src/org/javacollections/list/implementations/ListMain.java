package org.javacollections.list.implementations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListMain {
  
	public static void main(String Args[])
	{
		List<User> usrlist = new ArrayList<User>();
		List<User> usrAlllist = new ArrayList<User>();
		ArrayListFunctions ArrayFunc = new ArrayListFunctions();
		ArrayFunc.AddTolist(usrlist, new User(22,"Sankar"));
		ArrayFunc.AddTolist(usrlist, new User(32,"Rajesh"));
		ArrayFunc.AddTolist(usrlist, new User(11,"Ashok"));
		ArrayFunc.AddTolist(usrlist, new User(11,"Arun"));
		//Display the Arraylist
		ArrayFunc.DisplayList(usrlist);
		//Sort using Comparable
		Collections.sort(usrlist);
		System.out.println("After Soting based on id using Comparable");
		ArrayFunc.DisplayList(usrlist);
		
		//sort using Comparator
		UsrNameCompare UsrCmp = new UsrNameCompare();
		Collections.sort(usrlist,UsrCmp);
		System.out.println("After Soting based on Name using Comparator");
		ArrayFunc.DisplayList(usrlist);
		
		usrAlllist = ArrayFunc.AddAlltoList(usrlist);
		System.out.println("Display all the List after all data");
		
		//Display List using For and Iterators
		ArrayFunc.DisplayList(usrAlllist);
		ArrayFunc.DisplayListItr(usrAlllist);
		
		//Remove all the objects in the List
		List<User> UsrListRemoved = ArrayFunc.Removeall(usrAlllist);
		//Display List using For and Iterators
		 ArrayFunc.DisplayList(UsrListRemoved);
	}
}
