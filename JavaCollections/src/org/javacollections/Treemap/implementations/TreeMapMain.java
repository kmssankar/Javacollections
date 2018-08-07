package org.javacollections.Treemap.implementations;

import java.util.TreeMap;
/*Java TreeMap class implements the Map interface by using a tree. 
It provides an efficient means of storing key/value pairs in sorted order.
It is same as HashMap instead maintains ascending order.
*/
public class TreeMapMain {

	public static void main(String[] args) {
		
		TreeMap <Integer,MobileBrands> BrandMap = new TreeMap<Integer ,MobileBrands>();
		TreeMapFunctions TMF = new TreeMapFunctions();
		TMF.addToTreemap(BrandMap, new MobileBrands(001,"Apple","Cupurtino,California,USA"));
		TMF.addToTreemap(BrandMap, new MobileBrands(002,"Google","1600 Amphitheatre Parkway in Mountain View, California, United States"));
		TMF.addToTreemap(BrandMap, new MobileBrands(007,"Samsung","Suwon, Gyeonggi-do, South Korea"));
		TMF.addToTreemap(BrandMap, new MobileBrands(004,"Nokia","Espoo, Finland"));
		
		TMF.showMap(BrandMap, "Iteration using Entry Set");
		
		TMF.showMap(BrandMap);
		System.out.println("First element : " + BrandMap.firstEntry().getKey() + " value : " + BrandMap.firstEntry().getValue());
		System.out.println("Last element : " + BrandMap.lastEntry().getKey() + " Value " + BrandMap.lastEntry().getValue());
	}

}
