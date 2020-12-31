package java_410;

public class String_13 {

	public static void main(String[] args) {
		
		String[] numbers = {"1.3", "2.5", "3.7", "4.3", "5.4"};
		
		String result_1 = "";
		
		double result_2 = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			result_1 += numbers[i];					  // 문자연산
			result_2 += Double.parseDouble(numbers[i]); // 숫자연산 , 실수는 기본적으로 오차를 가지고 있다.
		}
		
		System.out.println("result_1 : " + result_1);
		System.out.println("result_2 : " + result_2);
	}
}


