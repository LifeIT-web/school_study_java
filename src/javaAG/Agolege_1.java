package javaAG;

public class Agolege_1 {

	static int min3(int a, int b, int c) {
		int min = a;
		
		if (b < min) {
			min = b;
		}else {
			min = c;
		}
		
		return min;
	}
	
	public static void main(String[] args) {
		System.out.println("최소값 : " + min3(10, -10, 0));
	}
}
