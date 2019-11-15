package pijusgo;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<Object> ny=new HashSet <Object>();
		ny.add("pijus");
		ny.add(12);
		ny.add(true);
		ny.add(12.43);
		ny.add(123.77654677f);
		ny.add(12345567789l);
		ny.add(89);
		ny.add(8);
		System.out.println(ny);
		System.out.println(ny.hashCode());
		System.out.println(ny.isEmpty());
		System.out.println(ny.toString());
				
		
		
	}

}
