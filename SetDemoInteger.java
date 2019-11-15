package pijusgo;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<Integer> ny=new HashSet <Integer>();
		
		ny.add(44);
		ny.add(43);
		ny.add(45);
		ny.add(46);
		ny.add(47);
		ny.add(48);
		ny.add(49);
		System.out.println(ny.size());
		System.out.println(ny.hashCode());
		
	}

}
