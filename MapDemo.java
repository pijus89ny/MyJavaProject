package pijusdemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Map<Integer, String> map=new HashMap<Integer,String>();
		map.put(1, "p");
		map.put(2, "");
		map.put(3, "pijus");
		map.put(4, "jon");
		map.put(5, "puja");
		map.put(6, "node");
		map.put(7, "dikpik");
		System.out.println(map);
		System.out.println("Is this map empty?"+map.isEmpty());
		System.out.println(map.values());
		System.out.println(map.toString());
		
		HashMap<Integer,String> anotherMap=new HashMap<Integer,String>();
		
		map.putAll(anotherMap);
		System.out.println("another map values:"+anotherMap);
		System.out.println(map.values());
		System.out.println(map.keySet());
		System.out.println("print entry set:"+map.entrySet());
		System.out.println("The size of the map is:"+map.size());
		System.out.println("is there a value for key 2?"+map.containsKey(2));
		
		System.out.println("is there a value-pream?"+map.containsValue("pream"));
		System.out.println("comparing two maps thats contains exactly same set of keys and values:"+map.equals(map));
		System.out.println("looping thought map elements:");
		for(int i=0;i<map.size();i++){
			System.out.println(i);
			System.out.println("the Hashcode of this map is:"+map.hashCode());
			System.out.println("clearing a map:");
			map.clear();
			System.out.println("map cleared:"+map);
			
			
		}
	}

}
