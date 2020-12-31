package java_428;

import java.util.HashSet;

public class HashSet_2 {

	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");
		set.add("abc");
		
		set.add(new King("Lee", 25));
		set.add(new King("Lee", 25));
		
		// 중복이 배제 , 순서의미가 없기에 뒤바낄수도 있으
		
		System.out.println(set);
	
	}
	
	
}

class King {
	String name;
	int age;
	
	King(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof King) {
			King tmp = (King) obj;
			return name.equals(tmp.name) && age == tmp.age;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
	
	@Override
	public String toString() {
		return name + " : " + age;
	}
}
