package org.javacollections.linkedlist.implementations;

import java.util.LinkedList;

public class LinkedListMain {

	public static void main(String[] args) {
     LinkedList<Course> CourseLL = new LinkedList<Course>();
     LinkedListFun LSFunc = new LinkedListFun();
     LSFunc.AddCourse(CourseLL, new Course(12,"ComputerScience"));
     LSFunc.AddCourse(CourseLL, new Course(13,"Electronics"));
     LSFunc.AddCourse(CourseLL, new Course(10,"Communication"));
     LSFunc.DisplayList(CourseLL);
	}

}
