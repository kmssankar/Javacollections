package org.javalegacy.collections;

import java.util.Properties;
import java.util.Set;

public class LegacyPropertiesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties Myprop = new Properties();
		Myprop.put("Feedback01", new Feedback(1,1,"Feedback01 - not Good"));
		Myprop.put("Feedback02", new Feedback(1,1,"Feedback02 - not Good"));
		Myprop.put("Feedback03", new Feedback(1,1,"Feedback03 - not Good"));
		
		Set<?> Myset = Myprop.keySet();
		
		for (Object obj : Myset )
		{
			System.out.println(obj + " Feedback -> " + Myprop.getProperty((String)obj) );
		}
	}
}
