package javaAG;

import java.util.Scanner;

public class Agolege_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오 :");
		int n = sc.nextInt();
		int i = 0;
		
		while (i <= n) {
			i++;
		}
		
		System.out.println("출력값은 " + i);
	}
}
