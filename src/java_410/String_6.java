package java_410;
//많이 씀*****
public class String_6 {

	public static void main(String[] args) {
		
		String[] juju = {"731223-1622314",
						 "800122-2365432",
						 "901123-1234567",
						 "970505-2345678",
						 "990321-1234567",
						 "981212-2345678"};
		
		
		for (int i = 0; i < juju.length; i++) {
		
			if (juju[i].substring(7, 8).equals("1")) {  // 문자열은 == 로 비교 불가(?) -> 물어보기
				System.out.println(juju[i] + " 남자");
			}
			else
			{
				System.out.println(juju[i] + " 여자");
			}
			
		}
		
		String str = "자바는 정말로 재미있습니다.";
		
		System.out.println(str.substring(1)); // 인데스 1부터 끝까지 출력 
		System.out.println(str.substring(4, 7)); // 인데스 4부터 7번 앞까지 출력(4~6)
		
	}
}
