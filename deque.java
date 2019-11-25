package CollectionTEST;

import java.util.ArrayDeque;

public class deque {

	public static void main(String[] args) {
		ArrayDeque<String> dq = new ArrayDeque<String>();
		
		dq.add("Manny");
		dq.add("Caren");
		dq.addLast("Mary");
		dq.addFirst("John");
		{
		System.out.println("Elements in deque: "+ dq);
		}
		
		dq.addFirst("Roger");
		dq.addLast("Robin");
		{
		System.out.println("Elements in Deque: " +dq);
		{
		System.out.println("Removed element: " +dq.removeFirst());
		{
		System.out.println("Removed element: " +dq.removeLast());
		}

		}
		
		}
		}

}
