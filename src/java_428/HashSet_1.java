package java_428;

import java.util.LinkedHashSet;
import java.util.Set;

public class HashSet_1 {

	public static void main(String[] args) {
		
		Object[] obj = {"1", new Integer(1), new Double(4.2), "4.2", "2", "2", "3", "3", "4", "4"};
		
		Set sett = new LinkedHashSet();
		// �������� ����, �ߺ��� ���x
		for (int i = 0; i < obj.length; i++) {
			sett.add(obj[i]);
		}
		// ���� 1�� ���� 1�� �ٸ��ɷ� �ν��Ѵ�.
		System.out.println(sett);
	}
}
