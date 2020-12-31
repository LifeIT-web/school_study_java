package java_410;

public class String_3 {

	public static void main(String[] args) {
		
		char[] char_str = new char[16];
		
		String str = " 오늘은 우리 스터디 하는 토요일";
		
		System.out.println(" str 문자 :  " + str);
		System.out.println(" str 문자수 :  " + str.length()); //String이라는 길이를 구할땐 length()메소드를 사용
		
		str.getChars(5, 11, char_str, 0); // 10~14번까지 15번 앞까지 
				// 여기부터 여기까지 여기에       0번부터 출력해라 즉  마지막 1 널으면 공백 들가고 출력!
		
		for (int i = 0; i < char_str.length; i++) {
			System.out.print(char_str[i]); 			// 중간 공백은 처름 가져온값 뒤 나머지 공백
		}
		
		str.getChars(0, 3, char_str, 0);
		for (int i = 0; i < char_str.length; i++) {  // 덮어 쓴것 우리 -> 오늘
			System.out.print(char_str[i]);
		}
	}
}
