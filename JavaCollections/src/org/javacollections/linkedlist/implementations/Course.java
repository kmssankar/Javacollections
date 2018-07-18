package org.javacollections.linkedlist.implementations;

public class Course {
	int CourseId;
	String CourseName;

	public Course(int courseId, String courseName) {
		super();
		CourseId = courseId;
		CourseName = courseName;
	}

	public int getCourseId() {
		return CourseId;
	}

	public void setCourseId(int courseId) {
		CourseId = courseId;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	@Override
	public String toString() {
		return "Course [CourseId=" + CourseId + ", CourseName=" + CourseName + "]";
	}

}
