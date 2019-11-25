package CollectionTEST;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Array5 {

	public static void main(String[] args) {
		
		 String[] array = {"candy", "chips", "fruits"};
		 
	        Set<String> set = new HashSet<>(Arrays.asList(array));
	        System.out.println("Set: " + set);
	}

}
