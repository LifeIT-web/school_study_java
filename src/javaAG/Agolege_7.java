package javaAG;

import java.util.Scanner;

public class Agolege_7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("a의 값 : ");
		int a = sc.nextInt();
		System.out.print("b의 값 : ");
		int b = sc.nextInt();
		
		do {
			if (a >= b) {
				System.out.println("a보다 큰 값을 입력하시오");
				System.out.print("b의 값 : ");
				b = sc.nextInt();
			}
		} while (a >= b);
		
		System.out.println("b-a 는 " + (b-a));
		
	}
}
