package org.javacollections.list.implementations;

import java.util.Comparator;

public class UsrNameCompare implements Comparator<User> {

	@Override
	public int compare(User usr1, User usr2) {
		// TODO Auto-generated method stub
		return usr1.getName().compareToIgnoreCase(usr2.getName());
	}

}
