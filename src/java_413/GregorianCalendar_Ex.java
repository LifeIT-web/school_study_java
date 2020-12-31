package java_413;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendar_Ex {

	public static void main(String[] args) {
		
		GregorianCalendar gcal = new GregorianCalendar();
		
		
		prn(" ������ : " + gcal.getTime());
		
		prn("������ ������ " + gcal.get(Calendar.DAY_OF_YEAR) + " �� �Դϴ�.");
		prn("������ �̹����� " + gcal.get(Calendar.DAY_OF_WEEK) + " �� �Դϴ�.");
		prn("������ ������ " + gcal.get(Calendar.WEEK_OF_YEAR) + " �� �Դϴ�.");
		prn("������ ���� " + gcal.get(Calendar.DAY_OF_MONTH) + " �� �Դϴ�.");
	
	}

	private static void prn(String str) {
		System.out.println(str);
	}
}
