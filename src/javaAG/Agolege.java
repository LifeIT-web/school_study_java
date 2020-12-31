package javaAG;

public class Agolege {
	
	 static int max4(int a, int b, int c, int d) {
		int max = a; 
		
		if (b > max) {
			max = b;
		} else if(c > max) {
			max = c;
		} else {
			max = d;
		}
		
		return max;
	}

	public static void main(String[] args) {
		
		System.out.println("최대값은 " + max4(10, 2, 30, 20));
	}
}
