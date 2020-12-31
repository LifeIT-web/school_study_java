package java_413;

public class StringBuffer_2 {

	public static void main(String[] args) {
		
		StringBuffer str = new StringBuffer("Java");
		str.append(" Program"); // 덮붙인다.
		//StringBuffer에는 append라는 메소드가 있다.
		System.out.println(str);
		
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i) + "\t");
		}
		
		str.insert(4, "★");
			// 인덱스 위치   , 문자를 넣어라
		System.out.println("\n" + str);
		System.out.println("문자열의 길이 : " + str.length());
		str.setLength(5); // 문자열 길이 재설정
		
		System.out.println("새로운 문자열의 길이 : " + str.length());
		System.out.println("setLength() 적용 문자열  : " + str);
		System.out.println("str.reverse() : " + str.reverse());
												// 역으로 프린트
	}
}
// 문자열 길이가 자주 바뀔때 String 보단 StringBuffer를 많이 쓴다.