package java_408;

import java.util.Date;

public class Date_1 {

	public static void main(String[] args) {

		Date date = new Date();
		
		int h = date.getHours(); // 권장하지 않는 메소드다~
		int m = date.getMinutes(); // 그래도 실행은 된다.
		int s = date.getSeconds();
		
		System.out.println("현재 시간은 : " + h + "시 " + m + "분" + s + "초");
		
		
		if( h > 12 ) {
			
			System.out.println("현재 시간은 : 오후 " + (h-12) + "시 " + m + "분" + s + "초");
			
		}
		else {
			
			System.out.println("현재 시간은 : 오전 " + h + "시 " + m + "분" + s + "초");
		}
		
	}
}
