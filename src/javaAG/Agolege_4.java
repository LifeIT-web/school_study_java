package javaAG;

import java.util.Scanner;

public class Agolege_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오 : ");
		int n = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		
		System.out.println("총합은 " + sum);
		
	}
}
