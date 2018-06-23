package org.javacollections.list.implementations;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
  
	public static void main(String Args[])
	{
		List<User> usrlist = new ArrayList<User>();
		List<User> usrAlllist = new ArrayList<User>();
		ArrayListFunctions ArrayFunc = new ArrayListFunctions();
		ArrayFunc.AddTolist(usrlist, new User(22,"Sankar"));
		ArrayFunc.AddTolist(usrlist, new User(32,"Sankar"));
		//Display the Arraylist
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
