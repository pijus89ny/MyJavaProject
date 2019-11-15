package manhattan;

import java.util.Vector;

public class LinkedListDemos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Vector ny=new Vector(2,9);
		ny.add(12);
		ny.add("pijus");
		ny.add(23.65433);
		
		
		System.out.println(ny);
		System.out.println(ny.capacity());
		System.out.println(ny.lastElement());
		System.out.println(ny.toString());
		System.out.println(ny.firstElement());
		
	}

}
