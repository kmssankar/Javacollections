package org.javacollections.Linkedhashmap.implementations;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.javacollections.Linkedhashmap.implementations.Shares;

public class LinkedHashMapFunctions {

	public void AddElement(LinkedHashMap<Integer, Shares> shareMap, Shares shares) {
		shareMap.put(shares.getShareId(), shares);
	}

	public void showElements(LinkedHashMap<Integer, Shares> InputMap, String Msg) {
		Set<Entry<Integer, Shares>> ItrSet = InputMap.entrySet();
		Iterator<Entry<Integer, Shares>> Itr = ItrSet.iterator();
		System.out.println("MSG : " + Msg);
		while (Itr.hasNext()) {
			Entry<Integer, Shares> Entries = Itr.next();
			System.out.println(" Key : " + Entries.getKey() + " Value :  " + Entries.getValue());
		}

	}

	public void showElements(LinkedHashMap<Integer, Shares> InputMap)
	{
		System.out.println("MSG : Traversing as using SET interface");
		for (Map.Entry<Integer, Shares> MapEntries: InputMap.entrySet())

		{
			System.out.println(MapEntries.getKey() + " Value : " + MapEntries.getValue());
		}
	}
	
	public void ContainKey(LinkedHashMap<Integer, Shares> InputMap , Integer Key)
	{
		String Msg = (InputMap.containsKey(Key))?"Key Found ":"Key Not Found ";
		System.out.println(Msg +  Key);
	}
	
	public void ContainValue(LinkedHashMap<Integer, Shares> InputMap , Shares SearchShare)
	{
		String Msg = (InputMap.containsValue(SearchShare))?"Key Found ":"Key Not Found ";
		System.out.println(Msg +  SearchShare);
	}
	
	//removes a Linked Hashmap element using the Key
	public void RemoveValue(LinkedHashMap<Integer, Shares> InputMap , Shares RemoveShare)
	{
		String Msg = (InputMap.remove(RemoveShare.getShareId())!=null)?"Value Removed ":"Value Not Found ";
		System.out.println(Msg +  RemoveShare);
	}
}
