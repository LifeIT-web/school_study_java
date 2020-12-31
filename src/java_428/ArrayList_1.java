package java_428;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList_1 {

	public static void main(String[] args) {
		
		ArrayList list_1 = new ArrayList(10);
		
		list_1.add(new Integer(5));
		list_1.add(new Integer(4));
		list_1.add(new Integer(3));
		list_1.add(new Integer(2));
		list_1.add(new Integer(0));
		list_1.add(new Integer(1));
		list_1.add(new Integer(3)); // List�� �ߺ��� ����� 

		ArrayList list_2 = new ArrayList(list_1.subList(1, 4)); 
										// list_1�� �ε��� 1�� 3���� ������ ����ְڴ�.
		
		print(list_1, list_2);
		
		Collections.sort(list_1);
		Collections.sort(list_2); //  ������� (�⺻ ��������)����
		print(list_1, list_2);
		
		System.out.println("list_1.containsAll(list_2) : " + list_1.containsAll(list_2));
														// list_1�� list_2�� �ִ� ��� ���� ������ �ճ�?
		list_2.add("B");
		list_2.add("C");
		list_2.add("A"); //  list_2 �� �߰�
		
		System.out.println("list_1.containsAll(list_2) : " + list_1.containsAll(list_2));
														// �߰��Ȱ��� ������ ���� �ʾ� false
		print(list_1, list_2);
		
		list_2.set(3, "Queen"); // list_2 �� 3�� �ε�������  "Queen"���� ����
		print(list_1, list_2);
		
		System.out.println("list_1.retainAll(list_2) : " + list_1.retainAll(list_2));
											// list_1���� list_2�� ��ġ�� �κ��� �ϳ���  �ֳ�?
		print(list_1, list_2);
		
		// list_2���� list_1�� ���Ե� ��ü���� ����
		
		for (int i = list_2.size() - 1; i >= 0; i--) {
			if (list_1.contains(list_2.get(i))) {
			// list_1�� ������ �ִ� ���� list_2�� �ִٸ� list_2�� ���� ����
				list_2.remove(i);
			}
		}
		
		print(list_1, list_2);
	}
	
	private static void print(ArrayList list_1, ArrayList list_2) {
		
		System.out.println("list_1 : " + list_1);
		System.out.println("list_2 : " + list_2);
		System.out.println();
	}
}
