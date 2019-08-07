package partice;


import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

public class StkDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		Stack<String>stk=new Stack<String>();
		
		
		
		stk.add("pijus");
		stk.add("sushanta");
		stk.add("p");
		stk.add("jon");
		stk.add("kona");
		stk.add("joe");
		stk.add("pj");
		stk.add("noe");
		stk.add("nikil");
		stk.add("roy");
		stk.add("nyc");
		System.out.println(stk.equals("nyc"));
		System.out.println(stk);
		
		System.out.println(stk.size());
		System.out.println(stk.capacity());
		stk.pop();
		System.out.println(stk);
		stk.empty();
		System.out.println(stk);
		System.out.println(stk.push("nyc"));
		Collections.sort(stk);
		System.out.println(stk);
		Collections.sort(stk, Collections.reverseOrder());
		System.out.println(stk);
		//
		for (int i=0; i<stk.size(); i++) {
			System.out.println(stk.get(i));
			///
			Iterator<String> myIterator= stk.iterator();
			while (myIterator.hasNext()) {
				System.out.println(myIterator.next());
				System.out.println(stk.equals("nyc"));
				System.out.println(stk);
				
				System.out.println(stk.size());
				System.out.println(stk.capacity());
				stk.pop();
				System.out.println(stk);
				stk.empty();
				System.out.println(stk);
				System.out.println(stk.push("nyc"));
				Collections.sort(stk);
				System.out.println(stk);
			}
			
			
			
			
		}
		
		
		
		
		
	}

}
