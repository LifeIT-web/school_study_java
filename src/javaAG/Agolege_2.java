package javaAG;

import java.util.Scanner;

public class Agolege_2 {

	static int med3(int a, int b, int c) {
		
		if (a >= b) {
			if (a >= c) {
				return a;
			}else {
				if (b >= c) {
					return c;
				}
				return b;
			}
			
		}else {
			if (b < c) {
				return b; 해결못함 별표처리함
			}else{
				if (a < c) {
					return c;
				}
				return a;
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("a를 입력하시오 : ");
			int a = sc.nextInt();
			System.out.println("b를 입력하시오 : ");
			int b = sc.nextInt();
			System.out.println("c를 입력하시오 : ");
			int c = sc.nextInt();
			
			System.out.println("중간값 " + med3(a, b, c));
	
		}

	}
}