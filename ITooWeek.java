package gohome;

public class ITooWeek {

	public static void main(String[] args) {
		System.out.println(getSumNumbers(2,4));
		System.out.println(getSumNumbers(6,8,90));

	
	}

	private static int getSumNumbers(int i, int j, int k) {
		int ny=i+j+k;
		return ny;
	}

	private static int getSumNumbers(int i, int j) {
	    int nj=i+j;
		return nj;
	}

}
