package java_ex_1;

import java.util.Scanner;

public class Pretice_Exc_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ϰų� �Է� : ");
		String a = sc.nextLine(); 
		
		switch (a) {
		case "A":
			System.out.println("a");
			break;
			
		case "B":
			System.out.println("b");
			break;

			
		case "C":
			System.out.println("c");
			break;


		default:
			System.out.println("�ƹ��ų�");
			
			break;
		}
	}
}
