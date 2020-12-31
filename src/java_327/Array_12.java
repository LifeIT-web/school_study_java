public class Array_12 
{
	public static void main(String[] args) 
	{
		if (args.length != 3)
		{
			System.out.println("usage : java Array_12 NUM1 op NUM2");
			System.exit(0); //프로그램 종료 exit(임의의 정수값) 0 , 1을 많이씀
		}

		int num1 =Integer.parseInt(args[0]); // 문자를 숫자로 변환
		char op = args[1].charAt(1); // ex) 숫자 /-----++++ 숫자         =>                /를 가져오고 ,                                    -를 가져옴
															// 문자열을 문자(char)로 변환 <charAt(0) 첫번째값을 가져오겠다, charAt(1) 두번째 값을 가져오겠다.
		int num2 =Integer.parseInt(args[2]);	
		int result = 0;

		switch (op)
		{
		case '+':
						result = num1 + num2;
						break;
		case '-':
						result = num1 - num2;
						break;
		case 'x':
						result = num1 * num2;
						break;
		case '/':
						result = num1 / num2;
						break;
		case 'X':
						result = num1 % num2;
						break;
		default:
			System.out.println("지원되지 않는 연산자 입니다.");
		}

		System.out.println(" 결과 : " + result);
		System.out.println("Lee jiyoon");
	}
}