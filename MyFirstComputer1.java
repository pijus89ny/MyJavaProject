package mypakage;

public class MyFirstCompute {

	public static boolean coppareTwoString(String a, String b) {
		boolean decision=a.equals(b);
		return decision;
	}
	
	public static void main(String[] args) {
		System.out.println(coppareTwoString("abc","Abc"));

	}

}
