package CollectionTEST;

import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class Hashmap1{

	public static void main(String[] args) {
		HashMap <Integer, String> hashm = new HashMap <Integer, String>();
		
		hashm.put(253, "Nyh");
		hashm.put(124, "Fats");
		hashm.put(36, "GG");
		hashm.put(98,"Old");
		
	Set entrySet = hashm.entrySet();
	
	Iterator it = entrySet.iterator();
	
	System.out.println("Hashmap key values in pair: ");
	while(it.hasNext()) {
		Map.Entry me = (Map.Entry) it.next();
		  System.out.println("Key is: "+me.getKey() + 
			       " & " + 
			       " value is: "+me.getValue());
	}
	}
	}
	
