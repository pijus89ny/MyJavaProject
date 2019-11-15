package collectiondemo;

import java.util.LinkedList;

public class LinkkedList5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               
		LinkedList ad=new LinkedList();
		
		ad.add("pijus");
		ad.add(12);
		ad.add(13);
		ad.add(12.12);
		ad.add("mondal");
		ad.add(2.765433);
		
		System.out.println(ad);
		System.out.println(ad.size());
		System.out.println(ad.toString());
		System.out.println(ad.peekLast());
		System.out.println(ad.peek());
		
		
		
	}

}
