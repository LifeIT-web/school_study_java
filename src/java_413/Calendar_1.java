package java_413;

import java.util.Calendar;

public class Calendar_1 {

	public static void main(String[] args) {
	
		Calendar cal_1 = Calendar.getInstance();
						 // �̱��� ���� : �ϳ��� ��ü�� ���� �����ϰڴ�.
						// getInstance()�޼ҵ带 ���� ����� �ִ�.
		System.out.println("Calendar Ŭ������ �̿��� �ð��� ��¥");
		System.out.println(cal_1.get(Calendar.YEAR) + " ��");
		System.out.println((cal_1.get(Calendar.MONTH) + 1) + " ��");
									// MONTH���� �ε�����  0������ ���۵ȴ�.
		System.out.println(cal_1.get(Calendar.DATE) + " ��");
		System.out.println(cal_1.get(Calendar.HOUR) + " ��");
		System.out.println(cal_1.get(Calendar.MINUTE) + " ��");
		System.out.println(cal_1.get(Calendar.SECOND) + " ��");
		
		
		
	}
}
// Date ���� Calendar �� �� ��ȣ�Ѵ�.