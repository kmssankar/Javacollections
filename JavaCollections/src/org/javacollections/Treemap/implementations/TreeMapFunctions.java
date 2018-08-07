package org.javacollections.Treemap.implementations;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapFunctions {

	private static final String Iterator = null;

	public void addToTreemap(TreeMap <Integer,MobileBrands> mapInp , MobileBrands MbInp)
	{
		mapInp.put(MbInp.id, MbInp);
	}
	
	public void showMap(TreeMap <Integer,MobileBrands> mapDis,String msg ) 
	{
		Set<Entry<Integer,MobileBrands>> disSet = mapDis.entrySet();
		Iterator<Entry<Integer, MobileBrands>> itr = disSet.iterator();
		System.out.println(msg); 		
		while (itr.hasNext())
		{
			Entry<Integer, MobileBrands> each = itr.next();
			System.out.println("Key : " +each.getKey() + " Value : " + each.getValue());
		}
	}
	
	public void showMap(TreeMap <Integer,MobileBrands> mapDis) 
	{
		System.out.println("Itration using for EntrySet"); 		
		for(Entry<Integer,MobileBrands> element : mapDis.entrySet())
		{
			System.out.println("Key : " +element.getKey() + " Value : " + element.getValue());
		}
	}
}
