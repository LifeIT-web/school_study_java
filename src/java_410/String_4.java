package java_410;

public class String_4 {

	public static void main(String[] args) {
		
		
		
		String str = "2020 WorldCup Korea";
		
		System.out.println("���� ���ڿ� : " + str);
		System.out.println("���ڿ� ������ : ");
		
		
		for (int j = str.length()-1; j >= 0 ; j--) {
			System.out.print(str.charAt(j));
		}
		
		
		System.out.println("\n ¦��     ���ڿ� : ");
		 
		for (int j = 0; j < str.length(); j++) {
			if (j % 2 != 1) {
				System.out.print(str.charAt(j));
			}
			else
			{
				System.out.print("");
			}
			
		}
		
		System.out.println("\n Ȧ��     ���ڿ� : ");
		
		for (int j = 0; j < str.length(); j++) {
			if (j % 2 != 0) {
				System.out.print(str.charAt(j));
			}
			else
			{
				System.out.print("");
			}
			
		}
	}
}
