package java_331;

public class Circle_1 {

	public static void main(String[] args) {
		final float PI = 3.1415f;
		int r = 10;
		
		
		
		
//		Math.PI = 6.77; (final 이라 값 변경 할 수 없다.)
//		PI = 6.0f;
		
		
		double area = PI * r * r; //cm2
		float l = 2*r*PI;
		
		System.out.printf("원의 넓이 : %5.2f\u33A0", area );
		System.out.println("\n원의 둘레 : " + l + "\u339D");
	}
}
