package org.javacollections.hashmap.implementations;

import java.util.HashMap;

/*Java HashMap class implements the map interface by using a hashtable. It inherits AbstractMap class and implements Map interface.
	A HashMap contains values based on the key.
	It contains only unique elements.
	It may have one null key and multiple null values.
    It maintains no order
*/
public class HashMapMain {

	public static void main(String[] args) {

		HashMap <Integer ,Shares> ShareMap = new HashMap<Integer,Shares>();
		HashMapFunctions HSF =new HashMapFunctions();
		System.out.println("Is Empty : "+ShareMap.isEmpty());
		HSF.AddElement(ShareMap, new Shares(12,"ACC","Consulting and IT"));
		HSF.AddElement(ShareMap, new Shares(13,"CTSH","IT and Outsourcing"));
		HSF.AddElement(ShareMap, new Shares(12,"Dell","IT and HardWare"));
		HSF.showElements(ShareMap, "Iterating Via set Interface");
		Shares Thought = new Shares(32,"THWKS","Consulting and Business Intelligence");
		HSF.AddElement(ShareMap,Thought);
		HSF.showElements(ShareMap);
		HSF.ContainKey(ShareMap, 12);
		HSF.ContainValue(ShareMap, Thought);
	}

}
