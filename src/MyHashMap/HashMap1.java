package MyHashMap;

import java.util.HashMap;


public class HashMap1 {

	public static void main(String[] args) {
		
		HashMap<String, String> tcData = new HashMap<String, String>();
		tcData.put("Name","Mike");
		tcData.put("Location","Hyderabad");
		tcData.put("Country","India");
		
		for (HashMap.Entry<String, String> m : tcData.entrySet()) {
			System.out.println(m.getKey() + ":" + m.getValue());
		}

	}

	}


