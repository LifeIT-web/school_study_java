package java_428;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetLotto {

	public static void main(String[] args) {
		
		Set<Integer> set = new TreeSet<>();
		Set<Integer> set2 = new TreeSet<>();
								// �ڵ� ����
		for (; set.size() < 6;) {
			
			int num = (int)(Math.random() * 45 + 1);
			
			set.add(new Integer(num)); // �ߺ� x
		}
		
		System.out.println(set);
		
		for (; set2.size() < 7;) {
			int num = (int)(Math.random() * 45 + 1);
			
			set2.add(new Integer(num));
		}
		
		System.out.println(set2);
		
	}
}
