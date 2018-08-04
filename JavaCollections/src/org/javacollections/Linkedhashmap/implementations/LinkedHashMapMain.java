package org.javacollections.Linkedhashmap.implementations;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.javacollections.Linkedhashmap.implementations.Shares;

/*
 Java LinkedHashMap class is Hash table and Linked list implementation of the Map interface, with predictable iteration order.
It inherits HashMap class and implements the Map interface.
It is same as HashMap instead maintains insertion order.
*/
public class LinkedHashMapMain {

	public static void main(String[] args) {
		System.out.println(" !! Collections -> Linked Hash Map !!");
		LinkedHashMap <Integer ,Shares> ShareMap = new LinkedHashMap<Integer,Shares>();
		LinkedHashMapFunctions LHMF = new LinkedHashMapFunctions();
		LHMF.AddElement(ShareMap, new Shares(12,"ACC","Consulting and IT"));
		LHMF.AddElement(ShareMap, new Shares(13,"CTSH","IT and Outsourcing"));
		LHMF.AddElement(ShareMap, new Shares(12,"Dell","IT and HardWare"));
		LHMF.showElements(ShareMap, "Iterating Via set Interface");
		Shares Thought = new Shares(32,"THWKS","Consulting and Business Intelligence");
		LHMF.AddElement(ShareMap,Thought);
		LHMF.showElements(ShareMap);
		LHMF.RemoveValue(ShareMap,Thought);
		LHMF.showElements(ShareMap);
	}
}

/*OUTPUT:
	 !! Collections -> Linked Hash Map !!
	 MSG : Iterating Via set Interface
	  Key : 12 Value :  Shares [shareId=12, tickker=Dell, companyDesc=IT and HardWare]
	  Key : 13 Value :  Shares [shareId=13, tickker=CTSH, companyDesc=IT and Outsourcing]
	 MSG : Traversing as using SET interface
	 12 Value : Shares [shareId=12, tickker=Dell, companyDesc=IT and HardWare]
	 13 Value : Shares [shareId=13, tickker=CTSH, companyDesc=IT and Outsourcing]
	 32 Value : Shares [shareId=32, tickker=THWKS, companyDesc=Consulting and Business Intelligence]
	 Value Removed Shares [shareId=32, tickker=THWKS, companyDesc=Consulting and Business Intelligence]
	 MSG : Traversing as using SET interface
	 12 Value : Shares [shareId=12, tickker=Dell, companyDesc=IT and HardWare]
	 13 Value : Shares [shareId=13, tickker=CTSH, companyDesc=IT and Outsourcing]*/
