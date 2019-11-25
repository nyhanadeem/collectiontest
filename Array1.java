package CollectionTEST;

import java.util.Arrays;
import java.util.Collections;

public class Array1 {

	public static void main(String[] args) {
		
		Integer[] arr = {67,5,200,54,39,64}; 
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.printf("Sorted arr[] = %s", 
				Arrays.toString(arr));
	}

}
