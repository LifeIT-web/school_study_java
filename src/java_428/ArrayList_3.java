package java_428;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_3 {

	public static void main(String[] args) {
		// 제네릭 : 받는것을 원하는 타입으로 받고 싶을때 쓰는것 (원하는 타입으로 일일이 변환 안해도 된다.) 
		// 장점 : 컴파일 하면서 에러를 바로 잡을 수 있다.
		
		ArrayList<String> numbers = new ArrayList<String>();
		// 원래는 다받을 수 있는데 제네릭으로 한정하는 순간 고정됨/	 String 생략 가능
		numbers.add("10");
		numbers.add("20");
		numbers.add("30");
		numbers.add("40");
		System.out.println("add(값)");
		System.out.println(numbers);

		numbers.add(1, "50"); // 객체 인덱스 1번에 50넣기 (덮어쓴게 아니라 , 1번에 넣고 그 뒷값은 밀려남)
		System.out.println("\nadd(인덱스, 값)");
		System.out.println(numbers);
		
		numbers.remove(2); // 객체 인덱스 2번에 20을 삭제 
		System.out.println("\nremove(인덱스)");
		System.out.println(numbers);
		
		System.out.println("\nget(인덱스)");
		System.out.println(numbers.get(2));  // 인덱스 2번에 값을 가져와
		
		System.out.println("\nsize()");
		System.out.println(numbers.size()); // 크기
		
		System.out.println("\nindexOf()");
									//**
		System.out.println(numbers.indexOf("45")); // 45 들어있는값이 아니므로 -1로 출력
								// 값이 들어 있으면 그 들어있는 인덱스 값을 출력
		
		Iterator it = numbers.iterator();
						// iterator_1.txt 참고
		System.out.println("\niterator");
		while (it.hasNext()) {
			String value =  (String) it.next(); // Object값을 String으로 캐스팅
			if (value.equals("30")) {
				it.remove();
			}
			System.out.println(value); // remove 전
		}
		
		System.out.println(numbers); // remove 후
		
		System.out.println("\nfor each");
		for (String value : numbers) { // 향상된 for문  -> 배열, 컬렉션에서 쓰임
			System.out.println(value);
		}
		
		System.out.println("\nfor");
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
	}
}
