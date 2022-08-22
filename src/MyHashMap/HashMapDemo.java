package MyHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
        
		//Declaration
		
		//HashMap hm = new HashMap();// We don't use this in Hash Map
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();//Integer-keys,String-Values
		
		//Adding pair into hashmap
		
		hm.put(01,"Vihan");
		hm.put(02,"Viyona");
		hm.put(03,"Amol");
		hm.put(04,"Katyare");
		hm.put(05,"Supriya");
		
		System.out.println(hm);
		
		//remove a pair from hashmap
		hm.remove(4);
		System.out.println("After remove a pair from hashmap:"+ hm);
		
		//Replace pairs from hashmap
		hm.replace(03,"Ampu");
		
		System.out.println("Replace pairs from hashmap:"+ hm);
		
		//reading pairs using loop
		 
		 for(HashMap.Entry m : hm. entrySet()) 
		 {
	           System.out.println(m.getKey()+"  :\t " +m.getValue());
	}
	}

}
