package java_410;

public class String_7 {

	public static void main(String[] args) {
		
		String str = "�� ���� �ܾ ���ԵǾ� �ֳ���!";// �پ������� �ܾ�
		
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			
			if (str.charAt(i) == 32) { // ���� �ƽ�Ű �ڵ� : 32 -> ������ ���� �����Ҷ�
				count ++;
			}
		}
		
		System.out.println("�ܾ��� ���� : " +(count + 1) + "��");
	}
}
