package org.javacollections.list.implementations;
import java.util.*;
public class User implements Comparable<User>{
    private int id;
	private String name;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id = id;
	}
    public void setName(String name) {
		this.name = name;
	}
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int compareTo(User Usr) {
	
		return this.id - Usr.id;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}   
    
	
}
