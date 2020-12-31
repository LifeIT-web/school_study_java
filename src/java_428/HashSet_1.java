package java_428;

import java.util.LinkedHashSet;
import java.util.Set;

public class HashSet_1 {

	public static void main(String[] args) {
		
		Object[] obj = {"1", new Integer(1), new Double(4.2), "4.2", "2", "2", "3", "3", "4", "4"};
		
		Set sett = new LinkedHashSet();
		// 순서관계 없고, 중복을 허용x
		for (int i = 0; i < obj.length; i++) {
			sett.add(obj[i]);
		}
		// 문자 1과 숫자 1은 다른걸로 인식한다.
		System.out.println(sett);
	}
}
