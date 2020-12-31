package java_ex_1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("JSP");
		list.add(2, "Database");
		list.add("IBATIS");
		
		int size = list.size();
		System.out.println("ÃÑ °´Ã¼ ¼ö : " + size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println(" 2 : " + skill);
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("IBATIS");
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println();
		
				
		
		
		
		
	}
}
