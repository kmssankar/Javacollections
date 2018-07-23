package org.javacollections.linkedlist.implementations;

import java.util.LinkedList;

public class LinkedListFun {

	public LinkedList<Course> AddCourse(LinkedList<Course> ListInp,Course Courseinst)
	{
		ListInp.add(Courseinst);
		return ListInp;
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
	
}
