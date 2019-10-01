package mypakage;

import java.util.Arrays;

public class MyFirstCompute {
       
 public static String  [] getStringArray(String sentance) {
	 String [] words = sentance.split(" ");
	 return words;
 }
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(getStringArray("We are very happy")));
	}

}
