package org.javacollections.hashset.implementations;

import java.util.HashSet;

public class HashSetFunctions {
	
	public void AddtoHashSet(HashSet<Insurance> InpHashset ,Insurance InsAdd)
	{
		InpHashset.add(InsAdd);
	}

	public void DisHashset(HashSet<Insurance> DisHashset ,String msg )
	{
		System.out.println("MSG : " + msg);
		
		for(Insurance Ins : DisHashset)
		{
			System.out.println(Ins);
		}
	}
	
	public void HashSethas(HashSet<Insurance> FullHashset ,Insurance InsSearch)
	{
		String Found = (FullHashset.contains(InsSearch))?"Data found":"Data Not found";
		System.out.println("Hash Set search "+InsSearch + "Result : " + Found );
	}
	
	public void HashsetRem(HashSet<Insurance> FullHashset , Insurance InsRemov)
	{
		String Msg = (FullHashset.remove(InsRemov))?"Removed " + InsRemov : InsRemov +" not Found !!";
		System.out.println(Msg);
	}
}
