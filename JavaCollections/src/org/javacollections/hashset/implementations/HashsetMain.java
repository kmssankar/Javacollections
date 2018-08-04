package org.javacollections.hashset.implementations;

import java.util.HashSet;

/*HashSet will allow null but no duplicates allowed (i.e more than one null)*/
public class HashsetMain {

	public static void main(String[] args) {
		HashSet <Insurance> InsHashInst = new HashSet<Insurance>();
		HashSetFunctions HSFUNC = new HashSetFunctions();
		HSFUNC.AddtoHashSet(InsHashInst, new Insurance(12,"Health","Active"));
		HSFUNC.AddtoHashSet(InsHashInst, new Insurance(23,"MotorVehicle","Active"));
		Insurance Insprop = new Insurance(32,"Property","Active");
		HSFUNC.AddtoHashSet(InsHashInst, Insprop);
		HSFUNC.AddtoHashSet(InsHashInst, Insprop);
		HSFUNC.DisHashset(InsHashInst, "Display after add");
		System.out.println("Count : " + InsHashInst.size());
		HashSet <Insurance> InsHashInstCln = (HashSet<Insurance>) InsHashInst.clone();
		HSFUNC.DisHashset(InsHashInstCln, "Cloned Hashset");
		HSFUNC.HashSethas(InsHashInstCln, Insprop);
		
		HSFUNC.HashsetRem(InsHashInstCln, Insprop);
		HSFUNC.AddtoHashSet(InsHashInstCln, new Insurance(23,"MotorVehicle","Active"));
		HSFUNC.AddtoHashSet(InsHashInstCln, null);
		HSFUNC.AddtoHashSet(InsHashInstCln, null);
		HSFUNC.DisHashset(InsHashInstCln, "After Removing Hashset");
		
		
	}

}

/*OUTPUT
MSG : Display after add
Insurance [policyNum=32, type=Property, status=Active]
Insurance [policyNum=12, type=Health, status=Active]
Insurance [policyNum=23, type=MotorVehicle, status=Active]
Count : 3
MSG : Cloned Hashset
Insurance [policyNum=32, type=Property, status=Active]
Insurance [policyNum=12, type=Health, status=Active]
Insurance [policyNum=23, type=MotorVehicle, status=Active]
Hash Set search Insurance [policyNum=32, type=Property, status=Active]Result : Data found
Removed Insurance [policyNum=32, type=Property, status=Active]
MSG : After Removing Hashset
null
Insurance [policyNum=12, type=Health, status=Active]
Insurance [policyNum=23, type=MotorVehicle, status=Active]
Insurance [policyNum=23, type=MotorVehicle, status=Active]*/
