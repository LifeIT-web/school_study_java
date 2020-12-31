package javaAG;

import java.util.Scanner;

public class Agolege_8 {

	public static void main(String[] args) {
		// 10을 나누고 10의 n승 + j 의 n이 자리수로 출력
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			
		System.out.print("양의 정수를 입력하시오");
		int a = sc.nextInt();
		int n = a / 10;
		int ctt = 1;
		
		do {
			System.out.print("양의 정수를 입력하시오");
			a = sc.nextInt();
		} while (a <= 0);
		*/ 수정 좀 해
		for (int i = 1; 9 <= n; i++) {
			n = n / 10;
			ctt += i;
		}
		
		System.out.println("양의 정수 자리수 : " + ctt);
		}
		
	}
	
}
