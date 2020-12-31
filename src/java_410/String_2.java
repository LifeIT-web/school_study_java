package java_410;

public class String_2 {

	public static void main(String[] args) {
	
		int ii = 77;
		float ff = 45.78f;
		
		String str = "점수  : ";
		
		System.out.println(str + ii + ff);  
		System.out.println("" + 2 + 0 + 2 + 0 + "코로나19"); // 숫자열 + 문자열 연산는 앞에 숫자연산끼리 계산된 후 문자열과 합쳐짐 
		System.out.println("국회의원 선서 : " + 2 + 0 + 2 + 0); // 문자열 + 숫자열은 문자열화 됨
		
	}	
}
