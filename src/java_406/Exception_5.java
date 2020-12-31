package java_406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception_5 {
	
	public static void main(String[] args) { // Exception 하나로 처리가능 / 예외는 JVM이 처리해줌
	
		
		try {
			input();
		}
		catch (ArithmeticException e) { //  수학적인 에러 -> 이 예외처리 설명을 주석으로 적어두면 유지보수가 쉽다.
			//System.out.println(e.getMessage()); -> 어떤 에러인지를 보여줌
			e.printStackTrace(); // 에러 위치 등 다 보여준다.
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
			System.out.print("첫번째 값을 입력하시오>>");
			int num1 = Integer.parseInt(in.readLine());
			
			System.out.print("두번째 값을 입력하시오>>");
			int num2 = Integer.parseInt(in.readLine());
			
			dividing(num1, num2);
		}
	}

	public static void dividing(int x, int y) throws ArithmeticException {
		
		System.out.println(x + " / " + y + " = " + (x / y)); // 날 호출한쪽으로 가서 값을 떠넘기겠다.
		// try catch 로 감쌀수 있다.
	}
}
