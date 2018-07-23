package org.javacollections.linkedlist.implementations;

import java.util.LinkedList;

public class LinkedListMain {

	public static void main(String[] args) {
     LinkedList<Course> CourseLL = new LinkedList<Course>();
     LinkedListFun LSFunc = new LinkedListFun();
     LSFunc.AddCourse(CourseLL, new Course(12,"ComputerScience"));
     LSFunc.AddCourse(CourseLL, new Course(13,"Electronics"));
     LSFunc.AddCourse(CourseLL, new Course(10,"Communication"));
     LSFunc.DisplayList(CourseLL,"After Adding");
     //add After an Index
     LSFunc.AddAtIdx(CourseLL, new Course(14,"Electrical Engineering"), 0);
     LSFunc.DisplayList(CourseLL,"After adding @ index 0");
     
     //get size of the Linked List
     System.out.println("Get size of the Linked List : " + CourseLL.size());
     System.out.println("Get first element : " +  CourseLL.getFirst());
     System.out.println("Get Last  element : " +  CourseLL.getLast());
     
     LSFunc.SetObject(CourseLL, new Course(15,"Communication Engineering"), 3);
     LSFunc.DisplayList(CourseLL,"After Setting new value @ index 3 ");
	}

}
