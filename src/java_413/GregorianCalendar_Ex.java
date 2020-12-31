package java_413;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendar_Ex {

	public static void main(String[] args) {
		
		GregorianCalendar gcal = new GregorianCalendar();
		
		
		prn(" 오늘은 : " + gcal.getTime());
		
		prn("오늘은 올해의 " + gcal.get(Calendar.DAY_OF_YEAR) + " 날 입니다.");
		prn("오늘은 이번주의 " + gcal.get(Calendar.DAY_OF_WEEK) + " 일 입니다.");
		prn("오늘은 올해의 " + gcal.get(Calendar.WEEK_OF_YEAR) + " 주 입니다.");
		prn("오늘은 달의 " + gcal.get(Calendar.DAY_OF_MONTH) + " 날 입니다.");
	
	}

	private static void prn(String str) {
		System.out.println(str);
	}
}
