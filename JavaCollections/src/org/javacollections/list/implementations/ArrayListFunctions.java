package org.javacollections.list.implementations;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListFunctions {

	public List<User> AddTolist(List<User> ListInput , User usradd)
	{
		ListInput.add(usradd);	
		return ListInput;	
	}
	
	public void DisplayList(List<User> DisList)
	{
		System.out.println("Display using <for Type Elment: ElemenList>");
		for(User Usr : DisList)
		{
			System.out.println("User Details : " + Usr.getId() +" Name : " + Usr.getName());
		}
	}
	
	// Add the element to the List
	public List<User> AddAlltoList(List<User> ListInput)
	{
		List<User> AllToListOut = new ArrayList<User>();
		AllToListOut.addAll(ListInput);
		return AllToListOut;
	}
	
	public void DisplayListItr(List<User> ListDis)
	{
		System.out.println("Display using Iterator !");
		Iterator Itr = ListDis.iterator();
				while(Itr.hasNext())
				{
					User Usr = (User) Itr.next();
					System.out.println(" Id : " + Usr.getId() + " Name : "+ Usr.getName());
				}
	}
	
	public List<User> Removeall(List<User> DelAllList)
	{
		DelAllList.removeAll(DelAllList);
		return DelAllList;
	}
	
	public void displayAtIdx(List<User> LSTINP , int Idx)
	{
		User ListInst = LSTINP.get(Idx);
		System.out.println(ListInst.toString());
	}
}
