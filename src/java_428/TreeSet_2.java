package java_428;

import java.util.TreeSet;

public class TreeSet_2 {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<>();
		
		String from = "b";
		String to = "d";
		
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("car");
		set.add("Car");
		set.add("disc");
		set.add("dance");
		set.add("dZZZZ");
		set.add("elevator");
		set.add("dzzzz");
		set.add("elephant");
		set.add("korea");
		set.add("fan");
		set.add("flower");
		
		System.out.println(set);
//		�빮�ڰ� ������ ~ 
		System.out.println("range search : from : " + from + " to : " + to);

		System.out.println("result1 : " + set.subSet(from, to));
//												����	 b~c����
		System.out.println("result2 : " + set.subSet(from, to + "zzzzz"));
//					b , d�� �����ϴ� �ͱ��� ���Ÿ� d�ڿ� zzzzz�� ���̱�
//					�� �ִ밪�� dzzzz�̴ϱ� zzzz�� ������ �� �տ������� ��µǴϱ� zzzzz�� �ٿ�����  
	}
}
