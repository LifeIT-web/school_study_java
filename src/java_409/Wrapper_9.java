package java_409;

public class Wrapper_9 {

	public static void main(String[] args) {
		
		short ss_data = 0;
		
		short max = Short.MAX_VALUE;
		short min = Short.MIN_VALUE;
		
		Short ss_1 = new Short("888"); //문자를 숫자로 바꾸는  Short 생성자
		
		ss_data = ss_1.shortValue();
		
		System.out.println("ss_1 : " + ss_1);
		System.out.println("ss_data : " + ss_data);
		System.out.println("max : " + max);
		System.out.println("min : " + min);
	}
}
//난수는 Math에 있는 random 메소드를 쓸때도 있고, random클래스로 쓸때도 있다.