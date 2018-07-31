package org.javalegacy.collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LegacyHashTableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable <String ,Feedback> FeedbackHST = new Hashtable <String ,Feedback>();
		FeedbackHST.put("First", new Feedback(12,4,"Excellent"));
		FeedbackHST.put("Sank", new Feedback(12,4,"Excellent"));
		FeedbackHST.put("Det", new Feedback(12,4,"Excellent"));
		
		Enumeration<Feedback> Fedem = FeedbackHST.elements();
		
		while(Fedem.hasMoreElements())
		{
			//System.out.println("Feed back " + Fedem.hashCode());
			System.out.println("Feed back " + Fedem.nextElement());
		}
		
		Set<Entry<String, Feedback>> HTSet = FeedbackHST.entrySet();
		System.out.println("Using  Iterator !!");
		Iterator<Entry<String, Feedback>> HTSetITr = HTSet.iterator();
		while (HTSetITr.hasNext())
		{
			Entry<String, Feedback> ItrMap =  HTSetITr.next();
			System.out.println("Key : " + ItrMap.getKey()+ " Value : " + ItrMap.getValue());
			
		}
	}
}


/*OUTPUT
Feed back Feedback [userId=12, feedbackRating=4, feedbackComments=Excellent]
Feed back Feedback [userId=12, feedbackRating=4, feedbackComments=Excellent]
Feed back Feedback [userId=12, feedbackRating=4, feedbackComments=Excellent]
Using  Iterator !!
Key : Det Value : Feedback [userId=12, feedbackRating=4, feedbackComments=Excellent]
Key : Sank Value : Feedback [userId=12, feedbackRating=4, feedbackComments=Excellent]
Key : First Value : Feedback [userId=12, feedbackRating=4, feedbackComments=Excellent]*/