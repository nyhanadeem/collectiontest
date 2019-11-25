package CollectionTEST;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Array4 {

	public static void main(String[] args) {
		
		   LinkedList<String> linkedlist = new LinkedList<String>();
		    linkedlist.add("Hairy");
		    linkedlist.add("Mack");
		    linkedlist.add("Tick");
		    linkedlist.add("Icky");
		    linkedlist.add("Rocky");

		    ArrayList <String> li = new ArrayList<String>(linkedlist);
 
		    for (String str : li){
		      System.out.println(str);
	}
	}
}
