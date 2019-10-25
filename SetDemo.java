package jon;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
   
    	
    	
    
	public static void main(String[] args) {
	
		Set<String> dk=new HashSet <String>();
		dk.add("pijus");
		dk.add("jon");
		dk.add("sorna");
		dk.add("mona");
		dk.add("kona");
		dk.add("mitu");
		dk.add("sathe");
		dk.add("bistry");
		dk.add("dipika");
		dk.add("mondal");
		System.out.println(dk);
		System.out.println(dk.hashCode());
		System.out.println(dk.toString());
		System.out.println(dk.isEmpty());
		System.out.println(dk.size());
		
	}   

}
