package org.javacollections.linkedlist.implementations;

import java.util.LinkedList;

public class LinkedListFun {

	public LinkedList<Course> AddCourse(LinkedList<Course> ListInp,Course Courseinst)
	{
		ListInp.add(Courseinst);
		return ListInp;
	}
	
	public void DisplayList(LinkedList<Course> DisInp)
	{
		for(Course Crs: DisInp)
		{
			System.out.println(Crs);
		}
	}
}
