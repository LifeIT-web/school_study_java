package java_406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception_5 {
	
	public static void main(String[] args) { // Exception �ϳ��� ó������ / ���ܴ� JVM�� ó������
	
		
		try {
			input();
		}
		catch (ArithmeticException e) { //  �������� ���� -> �� ����ó�� ������ �ּ����� ����θ� ���������� ����.
			//System.out.println(e.getMessage()); -> � ���������� ������
			e.printStackTrace(); // ���� ��ġ �� �� �����ش�.
		}
		catch (IOException e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch (NumberFormatException e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	private static void input() throws ArithmeticException, IOException, NumberFormatException{
		
		BufferedReader in =
					new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			System.out.print("ù��° ���� �Է��Ͻÿ�>>");
			int num1 = Integer.parseInt(in.readLine());
			
			System.out.print("�ι�° ���� �Է��Ͻÿ�>>");
			int num2 = Integer.parseInt(in.readLine());
			
			dividing(num1, num2);
		}
	}

	public static void dividing(int x, int y) throws ArithmeticException {
		
		System.out.println(x + " / " + y + " = " + (x / y)); // �� ȣ���������� ���� ���� ���ѱ�ڴ�.
		// try catch �� ���Ҽ� �ִ�.
	}
}
