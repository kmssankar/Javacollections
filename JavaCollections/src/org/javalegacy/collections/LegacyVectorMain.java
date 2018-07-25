package org.javalegacy.collections;

import java.util.Enumeration;
import java.util.Vector;
/*All the legacy classes are synchronized*/
public class LegacyVectorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Feedback> Ve = new Vector<Feedback>();
		Ve.add(new Feedback(1,4,"Very Good"));
		Ve.add(new Feedback(2,4,"N/A"));
		Ve.add(new Feedback(3,5,"ExtraOrdinary"));
		
		Enumeration<Feedback> Enm = Ve.elements();
		
		while(Enm.hasMoreElements())
			{
				Feedback Fed =(Feedback) Enm.nextElement(); 
				System.out.println(Fed);
			}
		System.out.println("Vector Size    : " + Ve.size());
		System.out.println("Element @ 1    : " + Ve.elementAt(1));
		System.out.println("Vector Hash    : " + Ve.hashCode());
		System.out.println("Vector First   : " + Ve.firstElement());
		System.out.println("Vector Stream  : " + Ve.stream().toString());
		
	}

}
