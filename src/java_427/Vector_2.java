package java_427;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class Vector_2 {

	public static void main(String[] args) {
		
		int i;
		Date date = new Date();
		Vector vv = new Vector(3, 5);
		
		vv.add("Java");
		vv.add(new Double(56.7));
		vv.add(date);
		
		System.out.println("========= 3개의 객체 추가 ============");
		
		System.out.println("size 11: " + vv.size() + ", capacity : " + vv.capacity());
		
		System.out.println("================================");
		
		for (int j = 0; j < 10; j++) {
			vv.add(new Integer(j+1)); // object 요구할때 이걸로 써! Integer객체타입으로 적어줘
//			vv.add(j+1); // object x
		}
		
		vv.add("korea");
		
		System.out.println("========= 10개의 객체 추가 ===========");
		System.out.println("size 22: " + vv.size() + ", capacity : " + vv.capacity());
		
		System.out.println("------------- Vector 내용 출력 --------");
		
		Enumeration enu = vv.elements(); // 리턴타입이 열거타입이다.
		// 열거타입
		
		while (enu.hasMoreElements()) {// 열거타입의 값이 있다면
			System.out.println(enu.nextElement() + " "); //  백터에 있는 값들을 하나씩 출력
		}
		
		System.out.println("======객체포함 확인 ========");
		
		if (vv.contains("Javar")) { //  Javar라는 글자가 포함 되어 있냐?
			System.out.println("Java 문자열 포함됨");
		}
		else
		{
			System.out.println("Java 문자열 포함 안안안됨");
		}
		
		System.out.println("56.7 객체 위치 : " + vv.indexOf(new Double(56.7)));
		System.out.println("\n 입력시간 : " + vv.get(vv.indexOf(date)));
		
		// Vector는 capacity가 부족할 경우 자동적으로
		// 기존의 크기보다 2배의 크기로 증가됨
		// 그래서 v의 capacity는 12가됨
		
		// date 객체 삭제
		
		vv.removeElementAt(vv.lastIndexOf(date));
		
		for (int j = 0; j < vv.size(); j+=3) {
			vv.removeElementAt(j); // 3번 더한 방 값 지워라
		}
		
		vv.setElementAt("seoul", 2);
				// 3번째 위치에 korea 문자열 추가
		
		enu = vv.elements();
		
		while (enu.hasMoreElements()) { 
			System.out.println(enu.nextElement() + " ");
		}
		
		System.out.println("\n size : " + vv.size() + ", capacity : " + vv.capacity());
		
		vv.trimToSize(); // 공백제거
		System.out.println("\n size : " + vv.size() + ", capacity : " + vv.capacity());
		
		vv.setSize(3); // 크기를 3으로 조정
		
		enu = vv.elements();
		
		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement() + " ");
		}
		
		vv.removeAllElements(); // 모든 객체 제거
		System.out.println("\n size : " + vv.size() + ", capacity : " + vv.capacity());
		
		
	}
}


//  백터 : 정수와 문자열을 같이 쓸수 있다.( = 다 받아 드릴수 있다.)

// 근데 백터보단 ArrayList를 많이 쓴다.