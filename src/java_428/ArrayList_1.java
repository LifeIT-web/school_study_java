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
		list_1.add(new Integer(3)); // List는 중복을 허용함 

		ArrayList list_2 = new ArrayList(list_1.subList(1, 4)); 
										// list_1의 인덱스 1번 3까지 가져다 집어넣겠다.
		
		print(list_1, list_2);
		
		Collections.sort(list_1);
		Collections.sort(list_2); //  순서대로 (기본 오름차순)정렬
		print(list_1, list_2);
		
		System.out.println("list_1.containsAll(list_2) : " + list_1.containsAll(list_2));
														// list_1는 list_2에 있는 모든 값을 가지고 잇냐?
		list_2.add("B");
		list_2.add("C");
		list_2.add("A"); //  list_2 값 추가
		
		System.out.println("list_1.containsAll(list_2) : " + list_1.containsAll(list_2));
														// 추가된값을 가지고 있지 않아 false
		print(list_1, list_2);
		
		list_2.set(3, "Queen"); // list_2 의 3번 인덱스값을  "Queen"으로 변경
		print(list_1, list_2);
		
		System.out.println("list_1.retainAll(list_2) : " + list_1.retainAll(list_2));
											// list_1에서 list_2와 겹치는 부분이 하나라도  있냐?
		print(list_1, list_2);
		
		// list_2에서 list_1에 포함된 객체들을 삭제
		
		for (int i = list_2.size() - 1; i >= 0; i--) {
			if (list_1.contains(list_2.get(i))) {
			// list_1이 가지고 있는 값이 list_2에 있다면 list_2의 값을 삭제
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
