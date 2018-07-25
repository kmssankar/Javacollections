package org.javacollections.linkedlist.implementations;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListFun {

	public LinkedList<Course> AddCourse(LinkedList<Course> ListInp,Course Courseinst)
	{
		ListInp.add(Courseinst);
		return ListInp;
	}
	
	public LinkedList<Course> AddCourseAtFirst(LinkedList<Course> ListInp,Course Courseinst)
	{
		ListInp.addFirst(Courseinst);
		return ListInp;
	}
	
	public LinkedList<Course> AddCourseAtLast(LinkedList<Course> ListInp,Course Courseinst)
	{
		ListInp.addLast(Courseinst);
		return ListInp;
	}
	
	public void showHash(LinkedList<Course> ListInp)
	{
		System.out.println("Hash Code : " +ListInp.hashCode());
	}
	// Display linked List
	public void DisplayList(LinkedList<Course> DisInp ,String Msg)
	{
		System.out.println(Msg);
		for(Course Crs: DisInp)
		{
			System.out.println(Crs);
		}
	}
	
	public LinkedList<Course> AddAtIdx(LinkedList<Course> ListInp,Course Courseinst,int Index)
	{
		ListInp.add(Index, Courseinst);
		return ListInp;
	}
	
	public LinkedList<Course> SetObject(LinkedList<Course> ListInp,Course Courseinst,int Index)
	{
		ListInp.set(Index, Courseinst);
		return ListInp;
	}
	
	//Display Linked List in Reverse order
	public void displayReverse(LinkedList<Course> LLC,String descForDisplay)
	{
		Iterator<Course> Itr  = LLC.descendingIterator();
		System.out.println(descForDisplay);
		while(Itr.hasNext())
			{
				Course CrsInst = Itr.next();
				System.out.println("Elem "+ CrsInst);
			}
	}	
	
	//Iteration using List Iterator	
	public void displayusingListItr (LinkedList<Course> LLC,String descForDisplay)
	{
		System.out.println(descForDisplay);
		ListIterator<Course> ListItr = LLC.listIterator();
		while(ListItr.hasNext())
			{
				Course CrsInst = ListItr.next();
				System.out.println("Elem "+ CrsInst);
			}	
	}
}
