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
//		대문자가 작은값 ~ 
		System.out.println("range search : from : " + from + " to : " + to);

		System.out.println("result1 : " + set.subSet(from, to));
//												정렬	 b~c까지
		System.out.println("result2 : " + set.subSet(from, to + "zzzzz"));
//					b , d로 시작하는 것까지 볼거면 d뒤에 zzzzz를 붙이기
//					저 최대값이 dzzzz이니까 zzzz을 넣으면 그 앞에까지만 출력되니까 zzzzz를 붙여야함  
	}
}
