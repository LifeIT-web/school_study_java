package java_429;

import java.util.HashMap;
import java.util.Map;

public class Generics_3 {

	public static void main(String[] args) {
		// 인터페이스 상속 받은 관계
		Map<String, Student> st = new HashMap<String, Student>();
		st.put("20090001", new Student(20090001, "구준표"));
		st.put("20090002", new Student(20090001, "금잔디"));
		st.put("20090003", new Student(20090001, "윤지후"));
		st.put("20090004", new Student(20090001, "홍길동"));
		
		//모든 항목을 출력
		System.out.println(st);
		
		//하나의 항목을 삭제
		st.remove("20090002");
		
		//하나의 항목을 대치
		st.put("20090003", new Student(20090003, "김채이"));
		
		//값을 참조
		System.out.println(st.get("20090003"));
		
		//모든 항목을 방문함
		for (Map.Entry<String, Student> s : st.entrySet()) {
			String key = s.getKey();
			Student value = s.getValue();
			System.out.println("key = " + key + ", value = " + value);
		}
		
	}
}


class Student{
	
	int number;
	String name;
	
	public Student(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	
}