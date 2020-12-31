package java_429;

import java.util.HashMap;
import java.util.Map;

public class Generics_3 {

	public static void main(String[] args) {
		// �������̽� ��� ���� ����
		Map<String, Student> st = new HashMap<String, Student>();
		st.put("20090001", new Student(20090001, "����ǥ"));
		st.put("20090002", new Student(20090001, "���ܵ�"));
		st.put("20090003", new Student(20090001, "������"));
		st.put("20090004", new Student(20090001, "ȫ�浿"));
		
		//��� �׸��� ���
		System.out.println(st);
		
		//�ϳ��� �׸��� ����
		st.remove("20090002");
		
		//�ϳ��� �׸��� ��ġ
		st.put("20090003", new Student(20090003, "��ä��"));
		
		//���� ����
		System.out.println(st.get("20090003"));
		
		//��� �׸��� �湮��
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