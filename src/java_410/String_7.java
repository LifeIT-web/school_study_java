package java_410;

public class String_7 {

	public static void main(String[] args) {
		
		String str = "몇 개의 단어가 포함되어 있나요!";// 붙어있으면 단어
		
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			
			if (str.charAt(i) == 32) { // 공백 아스키 코드 : 32 -> 공백이 없다 가정할때
				count ++;
			}
		}
		
		System.out.println("단어의 갯수 : " +(count + 1) + "개");
	}
}
