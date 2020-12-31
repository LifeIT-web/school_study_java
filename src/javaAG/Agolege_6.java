package javaAG;

import java.util.Scanner;

public class Agolege_6 {

	static int sumof(int a, int b) {
		
		int sum = 0;
		
		
		if (a < b) {
			
			for (; a <= b; a++) 
			{
				sum += a;
			}
		} else {
			for(; b <= a; b++) {
				sum += b;
			}
		}
		
		return sum;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력하시오 2개");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("총합 : " + sumof(a, b));
		
	}
	
}
