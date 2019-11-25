package CollectionTEST;

import java.util.HashMap;
import java.util.Map;

public class hashmap {

	public static void main(String[] args) {
		
	
				HashMap<Integer, String> hmap = new HashMap  <Integer, String>();
		
				hmap.put(22, "value1"); 
				hmap.put(45, "value2");
				
				for (HashMap.Entry<Integer, String> entry : hmap.entrySet()) {
				    System.out.println(entry.getKey() + " = " + entry.getValue());
				}
	}

}
