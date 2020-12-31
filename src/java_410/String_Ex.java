package java_410;

public class String_Ex {

	public static void main(String[] args) {
		
		String[] juju = {"731223-1622314",
				 		 "800122-2365432",
				 		 "901123-1234567",
				 		 "970505-2345678",
				 		 "990321-1234567",
				 		 "981212-2345678"};

		//2000년도 이후 주민 번호 뒷자리 3 , 4
		for (int i = 0; i < juju.length; i++) {
			
			if (juju[i].lastIndexOf("1", 7) == 7 || juju[i].indexOf("3", 7) == 7)  
			{  
				System.out.println(juju[i] + " 남자");
			}
			
			else
			{
				System.out.println(juju[i] + " 여자");
			}
			
		}
	}
}
// substring, Indexof, charAt 주민등록번호 찾을때 많이 쓴다.
// 그 중에서 substring을 많이 쓴다.