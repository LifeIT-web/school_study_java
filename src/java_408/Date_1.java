package java_408;

import java.util.Date;

public class Date_1 {

	public static void main(String[] args) {

		Date date = new Date();
		
		int h = date.getHours(); // �������� �ʴ� �޼ҵ��~
		int m = date.getMinutes(); // �׷��� ������ �ȴ�.
		int s = date.getSeconds();
		
		System.out.println("���� �ð��� : " + h + "�� " + m + "��" + s + "��");
		
		
		if( h > 12 ) {
			
			System.out.println("���� �ð��� : ���� " + (h-12) + "�� " + m + "��" + s + "��");
			
		}
		else {
			
			System.out.println("���� �ð��� : ���� " + h + "�� " + m + "��" + s + "��");
		}
		
	}
}
