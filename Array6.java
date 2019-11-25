package CollectionTEST;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Array6 {

	public static void main(String[] args) {
		ListIterator<String> litr = null;
				List names = new ArrayList<String>();
				names.add("haley");
				names.add("jess");
				names.add("fronto");
				names.add("zippy");
				names.add("hips");
				
				ListIterator<String> litr1 = names.listIterator();
				System.out.println("Traversing the list in forward direction");
				
				while(litr1.hasNext()) {
					
					System.out.println(litr1.next());
				}
				
				System.out.println("\nTraversing the list in backwards direction");
				while(litr1.hasPrevious()) {
					System.out.println(litr1.previous());
	}
	}

}
