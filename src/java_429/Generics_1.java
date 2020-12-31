package java_429;

import java.util.ArrayList;
import java.util.Iterator;

public class Generics_1 {

	public static void main(String[] args) {
				//***
		ArrayList<Student_3> list = new ArrayList<>();
		
		list.add(new Student_3("수선화", 1, 1));
		list.add(new Student_3("백합", 1, 2)); // 클래스 내의 있는 값이 ArrayList에 들어감
		list.add(new Student_3("장미", 1, 3));
		list.add(new Student_3("코스모스", 2, 1));
		list.add(new Student_3("해바라기", 2, 2));
		
		Iterator<Student_3> itt = list.iterator();
		
		while (itt.hasNext()) {
			Student_3 ss = itt.next();
			// ss 에 값들을 넣음
			System.out.print(ss.name + " " + ss.ban + " " + ss.noo + " ");
			
			
		}
		
		System.out.println();
		System.out.println();
	
		for (Student_3 ss : list) {
			System.out.println(ss.name);
		}
		// 1. 향상된 for문으로 쓸수 있다.
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {
			// Student_3 stt = list.get(i);
			// System.out.println(stt.name);
			// 위 아래 같은 내용 저 두줄을 한줄로 쓸수 있다.
			System.out.println(list.get(i).name);
		}
		// 2. for문으로도 얻을 수 있다.
	}

}

class Student_3{
	
	String name = "";
	int ban;
	int noo;
	
	public Student_3(String name, int ban, int noo) 
	{
		
		this.name = name;
		this.ban = ban;
		this.noo = noo;
		
	}
	
}
