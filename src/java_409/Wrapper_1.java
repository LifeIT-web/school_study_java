package java_409;

public class Wrapper_1 {

	public static void main(String[] args) {
		
		Integer one  = new Integer("345");
		Integer two  = new Integer(78);
		
		
		int total = one.intValue() + two.intValue(); // 숫자값으로 돌려 계산하것다.
		
		String totalString = one.toString() + two.toString(); // 숫자를 문자화 하겟다.
		
		System.out.println("one : " + one.intValue() + "\ntwo : "+ two.intValue());
		
		System.out.println("one : " + one + "\ntwo : "+ two);
	
		System.out.println("one + two = " + total);
		System.out.println("one.toString() + two.toString() = \n" + totalString);
		
		System.out.println(total + " >> 2 진수  : " + Integer.toBinaryString(total));
		System.out.println(total + " >> 8진수 : " + Integer.toOctalString(total));
		System.out.println(total + " >> 16진수 : " + Integer.toHexString(total));
		System.out.println(" 가장 큰 값 : " + Integer.MAX_VALUE);
		System.out.println(" 가장 작은 값 : " + Integer.MIN_VALUE);
	}
}
