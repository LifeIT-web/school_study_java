package java_409;

public class Wrapper_7 {

	public static void main(String[] args) {
		
		char[] obj = new char[args[0].length()+2]; //그러기 위해선 길이에 +2를 추가 2
		
		args[0].getChars(0, args[0].length(), obj, 2);
		// 0부터 args[0]길이만큼 obj에다가 2번부터 입력 하면 공백이 2개 생성되며 프린트
		
		for (int i = 0; i < obj.length; i++) {
			
			System.out.println("\t 입력된 문자[" + obj[i] + "]");
			
			if (Character.isDefined(obj[i])) {
				System.out.println("\t 유니코드입니다.");
			}
			
			if (Character.isLetter(obj[i])) {
				System.out.println("\t 문자입니다.");
			}

			if (Character.isDigit(obj[i])) {
				System.out.println("\t 숫숫자입니다.");
			}
			
			System.out.println();
			
		}
		for (int i = 0; i < obj.length; i++) {
			System.out.print(obj[i]);
		}
		System.out.println();
	}
}


// 0번부터 쓰면 0번부터 들어가는데 +2해버리면 공백 2개가 늘어나고 프린트
// **9줄  args[0].getChars(0(몇번째부터), args[0].length()(입력하려는 크기), obj(어디에다가), 2(몇번째까지)); 
// **7줄 char[] obj = new char[args[0].length()+2];