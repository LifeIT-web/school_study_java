public class Switch_1 
{
	public static void main(String[] args) throws Exception 
	{

		int a;

		System.out.print("1~9사이의 값을 입력하시오 ");
		a = System.in.read()-48;
/* 
		

	switch 문에 사용된 수식은 정수형 자료(문자포함) 이어야 한다.

	.case 문에 사용되는 값은 오로지 한 개의 값만 사용가능
	. if 문 처럼 논리값을 사용할순 없어
	. case 문에 실행문이 여러개 나오더라도
	 중괄호({})를 사용할수 읎다
	 break문이 없으면 다음 case 문으로 넘어감

*/
		switch (a)
		{
		case 1:
			System.out.println(a + " 는 홀수 입니다.");
		case 3:
		case 5:
		case 7:
		case 9:
			System.out.println(a + " 는 홀수 입니다.");
			break;

		default : 
			System.out.println(a + " 는 숫자 입니다.");
			break;

		case 2:
		case 4:
		case 6:
		case 8:
			System.out.println(a + " 는 짝수 입니다.");
			break;
		}
		System.out.println("Lee jiyoon");
	}
}
