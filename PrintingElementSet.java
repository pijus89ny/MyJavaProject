package traversal;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PrintingElementSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> myjob=new HashSet();
		
		myjob.add("p");
		myjob.add("i");
		myjob.add("j");
		myjob.add("u");
		myjob.add("s");
		myjob.add("m");
		// using Iterator class
		Iterator<String> itr= myjob.iterator();
		while(itr.hasNext()) {
		String element = itr.next();
		System.out.println(element);
		//using advanced (enhanced)for loop
		
		for (String item:myjob) {
		System.out.println(item);
		// iterating over set using forEach method
		myjob.forEach(System.out::println);
		}
		
		}
		
	

	
		
	}

}
