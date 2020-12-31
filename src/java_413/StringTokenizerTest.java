package java_413;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		String str = "자바는 다양한 문자열 처리,날짜 처리," +
					 "시간 처리를 위한 메소드를 갖고 있습니다.";
		
		StringTokenizer stt = new StringTokenizer(str, "리,");
	// "" 안에 있는 글자가 없어지고 나뉘어진 갯수 ",를" 하면 ","랑 "를"이 없어지고, 나뉘어짐  
		System.out.println("토큰 ',' 의 갯수 : " + stt.countTokens() + " 개");
		
		while (stt.hasMoreTokens()) { // 토큰이 있다면
			System.out.println(stt.nextElement()); // 하나씩 찍어내라
		}
	}
}
