package java_409;

public class Wrapper_5 {

	public static void main(String[] args) {
		
		Boolean bool_1 = new Boolean(true);
		Boolean bool_2 = new Boolean("456"); // true가 아닌 모든 문자열들은 false
		
		if (bool_1.booleanValue()) {
			System.out.println("bool_1 객체는            true  입니다.");
		}
		else {
			
			System.out.println("bool_1 객체는            false  입니다.");
		}
		if (bool_2.booleanValue()) {
			System.out.println("bool_2 객체는            true  입니다.");
		}
		else {
			
			System.out.println("bool_2 객체는            false  입니다.");
		}
	}
}
