package java_413;

public class StringBuffer_4 {

	public static void main(String[] args) {
		
		StringBuffer sb_1 = new StringBuffer("korea");
		StringBuffer sb_2 = new StringBuffer("korea");
		
		if (sb_1 == sb_2) {
			System.out.println("sb_1 == sb_2 = true");
		}
		else 
		{
			System.out.println("sb_1 == sb_2 = false");	
		}
		if(sb_1.equals(sb_2))
		{
			System.out.println("sb_1.equals(sb_2) = true");
		}
		else
		{
			System.out.println("sb_1.equals(sb_2) = false");
		}
		//  주소값이 다르지만 문자열이 같더라도 false가 오는 이유는 StringBuffer 클래스에 equals가 없기에
		// String 클래스 내에 equals라는 메소드가 있고, 그걸 오버라이딩 하여 쓴것
		// 그래서 주소값이 달라도 문자열이 같으면 true값이 나온다.
		
		// StringBuffer 의 내용을 String 으로 변환한다.
		
		String s_1 = sb_1.toString();
		String s_2 = sb_2.toString();
		
		if (s_1.equals(s_2)) {
			System.out.println("s_1.equals(s_2) = true");
		}
		else
		{
			
			System.out.println("s_1.equals(s_2) = false");
		}

	}
}
