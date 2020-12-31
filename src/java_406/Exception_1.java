package java_406;

import java.io.*; // java.io ��Ű���� �ִ� ��� Ŭ������ ����Ʈ ��Ų��.

public class Exception_1 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader input =
				new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {	
			
		
			
			try {
				
			System.out.print("ù��° ���� �Է��Ͻÿ�  ");
			int num1 = Integer.parseInt(input.readLine());
			
			
			System.out.print("�ι�° ���� �Է��Ͻÿ�  ");
			int num2 = Integer.parseInt(input.readLine());
			
			
			System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
			
			} 
			catch (NumberFormatException e) {
				
				System.out.println("���ڰ� �ü� �����ϴ�.");
				
				e.printStackTrace(); 
				System.out.println(e.getMessage());
				
			} 
			catch (ArithmeticException e) {
			
				System.out.println("�и� 0 �� �ü� �����ϴ�.");
				
				e.printStackTrace();
				System.out.println(e.getMessage());
			} 
			catch (Exception e) {
				e.printStackTrace();
			} 
			finally {
				System.out.println("�׽� ���´�~~~");
			}
		}
	}
}
// Exception ����ó���� �ʹ� �������̱⿡ �� �Ⱦ�. �� ���� �� �Ʒ��� ��ġ�ؾߵ� �ȱ׷� ������ �߻��Ѵ�.
// ��Ȯ�� ��ü���� ����ó���� �� ����. (�̰� �� ����)
// finally ������ �ִ��� ������ ������ ������ �ִٸ� �������ش�.
// e2.printStackTrace(); => ��� � ������ ���Դ��� �˷��ش�.
// System.out.println(e2.getMessage()); => ���� Ʋ�ȴ����� �˷��ش�.
// ��ġ�� �������� ������ �� ������ ����... �����尡 ���� �ֱ� ������...