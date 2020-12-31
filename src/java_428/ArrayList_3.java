package java_428;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_3 {

	public static void main(String[] args) {
		// ���׸� : �޴°��� ���ϴ� Ÿ������ �ް� ������ ���°� (���ϴ� Ÿ������ ������ ��ȯ ���ص� �ȴ�.) 
		// ���� : ������ �ϸ鼭 ������ �ٷ� ���� �� �ִ�.
		
		ArrayList<String> numbers = new ArrayList<String>();
		// ������ �ٹ��� �� �ִµ� ���׸����� �����ϴ� ���� ������/	 String ���� ����
		numbers.add("10");
		numbers.add("20");
		numbers.add("30");
		numbers.add("40");
		System.out.println("add(��)");
		System.out.println(numbers);

		numbers.add(1, "50"); // ��ü �ε��� 1���� 50�ֱ� (����� �ƴ϶� , 1���� �ְ� �� �ް��� �з���)
		System.out.println("\nadd(�ε���, ��)");
		System.out.println(numbers);
		
		numbers.remove(2); // ��ü �ε��� 2���� 20�� ���� 
		System.out.println("\nremove(�ε���)");
		System.out.println(numbers);
		
		System.out.println("\nget(�ε���)");
		System.out.println(numbers.get(2));  // �ε��� 2���� ���� ������
		
		System.out.println("\nsize()");
		System.out.println(numbers.size()); // ũ��
		
		System.out.println("\nindexOf()");
									//**
		System.out.println(numbers.indexOf("45")); // 45 ����ִ°��� �ƴϹǷ� -1�� ���
								// ���� ��� ������ �� ����ִ� �ε��� ���� ���
		
		Iterator it = numbers.iterator();
						// iterator_1.txt ����
		System.out.println("\niterator");
		while (it.hasNext()) {
			String value =  (String) it.next(); // Object���� String���� ĳ����
			if (value.equals("30")) {
				it.remove();
			}
			System.out.println(value); // remove ��
		}
		
		System.out.println(numbers); // remove ��
		
		System.out.println("\nfor each");
		for (String value : numbers) { // ���� for��  -> �迭, �÷��ǿ��� ����
			System.out.println(value);
		}
		
		System.out.println("\nfor");
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
	}
}
