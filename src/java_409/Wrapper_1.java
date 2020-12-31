package java_409;

public class Wrapper_1 {

	public static void main(String[] args) {
		
		Integer one  = new Integer("345");
		Integer two  = new Integer(78);
		
		
		int total = one.intValue() + two.intValue(); // ���ڰ����� ���� ����ϰʹ�.
		
		String totalString = one.toString() + two.toString(); // ���ڸ� ����ȭ �ϰٴ�.
		
		System.out.println("one : " + one.intValue() + "\ntwo : "+ two.intValue());
		
		System.out.println("one : " + one + "\ntwo : "+ two);
	
		System.out.println("one + two = " + total);
		System.out.println("one.toString() + two.toString() = \n" + totalString);
		
		System.out.println(total + " >> 2 ����  : " + Integer.toBinaryString(total));
		System.out.println(total + " >> 8���� : " + Integer.toOctalString(total));
		System.out.println(total + " >> 16���� : " + Integer.toHexString(total));
		System.out.println(" ���� ū �� : " + Integer.MAX_VALUE);
		System.out.println(" ���� ���� �� : " + Integer.MIN_VALUE);
	}
}
