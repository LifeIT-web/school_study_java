package java_413;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		String str = "�ڹٴ� �پ��� ���ڿ� ó��,��¥ ó��," +
					 "�ð� ó���� ���� �޼ҵ带 ���� �ֽ��ϴ�.";
		
		StringTokenizer stt = new StringTokenizer(str, "��,");
	// "" �ȿ� �ִ� ���ڰ� �������� �������� ���� ",��" �ϸ� ","�� "��"�� ��������, ��������  
		System.out.println("��ū ',' �� ���� : " + stt.countTokens() + " ��");
		
		while (stt.hasMoreTokens()) { // ��ū�� �ִٸ�
			System.out.println(stt.nextElement()); // �ϳ��� ����
		}
	}
}
