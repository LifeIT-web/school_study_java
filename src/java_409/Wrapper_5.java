package java_409;

public class Wrapper_5 {

	public static void main(String[] args) {
		
		Boolean bool_1 = new Boolean(true);
		Boolean bool_2 = new Boolean("456"); // true�� �ƴ� ��� ���ڿ����� false
		
		if (bool_1.booleanValue()) {
			System.out.println("bool_1 ��ü��            true  �Դϴ�.");
		}
		else {
			
			System.out.println("bool_1 ��ü��            false  �Դϴ�.");
		}
		if (bool_2.booleanValue()) {
			System.out.println("bool_2 ��ü��            true  �Դϴ�.");
		}
		else {
			
			System.out.println("bool_2 ��ü��            false  �Դϴ�.");
		}
	}
}
