package org.javacollections.hashmap.implementations;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapFunctions {

	public void AddElement(HashMap<Integer, Shares> InputMap, Shares Sh) {
		InputMap.put(Sh.shareId, Sh);
	}

	public void showElements(HashMap<Integer, Shares> InputMap, String Msg) {
		Set<Entry<Integer, Shares>> ItrSet = InputMap.entrySet();
		Iterator<Entry<Integer, Shares>> Itr = ItrSet.iterator();
		System.out.println("MSG : " + Msg);
		while (Itr.hasNext()) {
			Entry<Integer, Shares> Entries = Itr.next();
			System.out.println(" Key : " + Entries.getKey() + " Value :  " + Entries.getValue());
		}

	}

	public void showElements(HashMap<Integer, Shares> InputMap)
	{
		System.out.println("MSG : Traversing as using SET interface");
		for (Map.Entry<Integer, Shares> MapEntries: InputMap.entrySet())

		{
			System.out.println(MapEntries.getKey() + " Value : " + MapEntries.getValue());
		}
	}
	
	public void ContainKey(HashMap<Integer, Shares> InputMap , Integer Key)
	{
		String Msg = (InputMap.containsKey(Key))?"Key Found ":"Key Not Found ";
		System.out.println(Msg +  Key);
	}
	
	public void ContainValue(HashMap<Integer, Shares> InputMap , Shares SearchShare)
	{
		String Msg = (InputMap.containsValue(SearchShare))?"Key Found ":"Key Not Found ";
		System.out.println(Msg +  SearchShare);
	}
}
