package java_410;

public class String_3 {

	public static void main(String[] args) {
		
		char[] char_str = new char[16];
		
		String str = " ������ �츮 ���͵� �ϴ� �����";
		
		System.out.println(" str ���� :  " + str);
		System.out.println(" str ���ڼ� :  " + str.length()); //String�̶�� ���̸� ���Ҷ� length()�޼ҵ带 ���
		
		str.getChars(5, 11, char_str, 0); // 10~14������ 15�� �ձ��� 
				// ������� ������� ���⿡       0������ ����ض� ��  ������ 1 ������ ���� �鰡�� ���!
		
		for (int i = 0; i < char_str.length; i++) {
			System.out.print(char_str[i]); 			// �߰� ������ ó�� �����°� �� ������ ����
		}
		
		str.getChars(0, 3, char_str, 0);
		for (int i = 0; i < char_str.length; i++) {  // ���� ���� �츮 -> ����
			System.out.print(char_str[i]);
		}
	}
}
