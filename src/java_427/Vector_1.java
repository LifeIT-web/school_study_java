package java_427;

import java.util.Vector;

public class Vector_1 {

	public static void main(String[] args) {
		
		Vector vv = new Vector(5); //capacity 가 5인 Vector
		
		vv.add("1");
		vv.add("2");
		vv.add("3");
		vv.add("4");
		vv.add("5");
		vv.add("6");
		
		print(vv);
		
		vv.trimToSize(); // 빈공간을 없앤다 용량과 크기가 같아진다.
		
		System.out.println("===================66");
		
		print(vv);
		
		vv.ensureCapacity(7); // Vector 의 용량이 최소한 minCapacity
		System.out.println("===================77");
		print(vv);
		System.out.println("===================88");
		vv.add("1");
		vv.add("2");
		vv.add("3");
		vv.add("4");
		vv.add("5");
		vv.add("6");
		vv.add("7");
		vv.add("8");
		print(vv);
		
		vv.setSize(8);
		System.out.println("====================  =======99");
		print(vv);
		
		vv.clear(); // Vector를 비운다 (비어있지만 그공간은 확보하고 있다.)
		System.out.println("===================");
		print(vv);
	}
	
	public static void print(Vector vv) {
		
		System.out.println(vv);
		System.out.println("vv.size : " + vv.size());
		System.out.println("vv.capacity : " + vv.capacity());
		// vv.capacity()
		// 설명 - > collection.txt
	}
}
