package java_331;

public class Circle_1 {

	public static void main(String[] args) {
		final float PI = 3.1415f;
		int r = 10;
		
		
		
		
//		Math.PI = 6.77; (final �̶� �� ���� �� �� ����.)
//		PI = 6.0f;
		
		
		double area = PI * r * r; //cm2
		float l = 2*r*PI;
		
		System.out.printf("���� ���� : %5.2f\u33A0", area );
		System.out.println("\n���� �ѷ� : " + l + "\u339D");
	}
}
