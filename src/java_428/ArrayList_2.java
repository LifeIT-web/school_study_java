package java_428;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_2 {

	public static void main(String[] args) {
		
		final int LIMIT = 10; // ���ȭ ������ �Ұ�!
		
		String source = "0123456789abcdefghijklmABCDEFG@#$%^&*()ZZZ";
		
		int length = source.length();
		
		List list = new ArrayList(length / LIMIT + 10); //  ����� ���� ���׸��� ��޶�� ��� ǥ��!
										// ũ�⸦ �ణ �����ְ�
		
		for (int i = 0; i < length; i += LIMIT) {
			if (i + LIMIT < length) {
				list.add(source.substring(i, i + LIMIT)); //(i = 0�϶� 0~9���� �ڸ��� list�� ���̱�)
			}
			else {
				list.add(source.substring(i));
			}
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
