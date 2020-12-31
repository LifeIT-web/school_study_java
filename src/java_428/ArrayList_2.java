package java_428;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_2 {

	public static void main(String[] args) {
		
		final int LIMIT = 10; // 상수화 값변경 불가!
		
		String source = "0123456789abcdefghijklmABCDEFG@#$%^&*()ZZZ";
		
		int length = source.length();
		
		List list = new ArrayList(length / LIMIT + 10); //  노란색 줄은 제네릭을 써달라는 경고 표시!
										// 크기를 약간 여유있게
		
		for (int i = 0; i < length; i += LIMIT) {
			if (i + LIMIT < length) {
				list.add(source.substring(i, i + LIMIT)); //(i = 0일때 0~9까지 자르고 list에 붙이기)
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
