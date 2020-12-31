package java_413;

import java.util.Calendar;

public class Calendar_1 {

	public static void main(String[] args) {
	
		Calendar cal_1 = Calendar.getInstance();
						 // 싱글톤 패턴 : 하나의 객체를 통해 공유하겠다.
						// getInstance()메소드를 통해 만들수 있다.
		System.out.println("Calendar 클래스를 이용한 시간과 날짜");
		System.out.println(cal_1.get(Calendar.YEAR) + " 년");
		System.out.println((cal_1.get(Calendar.MONTH) + 1) + " 월");
									// MONTH만은 인덱스가  0번부터 시작된다.
		System.out.println(cal_1.get(Calendar.DATE) + " 일");
		System.out.println(cal_1.get(Calendar.HOUR) + " 시");
		System.out.println(cal_1.get(Calendar.MINUTE) + " 분");
		System.out.println(cal_1.get(Calendar.SECOND) + " 초");
		
		
		
	}
}
// Date 보단 Calendar 를 더 선호한다.