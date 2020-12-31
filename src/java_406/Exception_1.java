package java_406;

import java.io.*; // java.io 패키지에 있는 모든 클래스를 임포트 시킨다.

public class Exception_1 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader input =
				new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {	
			
		
			
			try {
				
			System.out.print("첫번째 값을 입력하시오  ");
			int num1 = Integer.parseInt(input.readLine());
			
			
			System.out.print("두번째 값을 입력하시오  ");
			int num2 = Integer.parseInt(input.readLine());
			
			
			System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
			
			} 
			catch (NumberFormatException e) {
				
				System.out.println("문자가 올수 없습니다.");
				
				e.printStackTrace(); 
				System.out.println(e.getMessage());
				
			} 
			catch (ArithmeticException e) {
			
				System.out.println("분모에 0 이 올수 없습니다.");
				
				e.printStackTrace();
				System.out.println(e.getMessage());
			} 
			catch (Exception e) {
				e.printStackTrace();
			} 
			finally {
				System.out.println("항시 나온다~~~");
			}
		}
	}
}
// Exception 예외처리는 너무 포괄적이기에 잘 안씀. 단 쓸때 맨 아래에 배치해야됨 안그럼 에러가 발생한다.
// 정확한 구체적인 예외처리가 더 좋다. (이걸 더 권장)
// finally 에러가 있던지 없던지 실행할 문장이 있다면 실행해준다.
// e2.printStackTrace(); => 어디서 어떤 에러가 나왔는지 알려준다.
// System.out.println(e2.getMessage()); => 뭐가 틀렸는지만 알려준다.
// 위치가 무작위로 나오는 건 스레드 때문... 스레드가 돌고 있기 때문에...