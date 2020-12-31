package java_401;
//중첩 클래스의 예
class AA
{
	static class BB
	{
		static int bb = 25;
		
		static class CC
		{
			int cc = bb + 77;
		}
	}
}//내부클래스 => 탐색기에 들어가서 클래스이름에 '$' 가 있으면 내부클래스


public class AATop {

	public static void main(String[] args) {
		
		AA.BB.CC  obj1 = new AA.BB.CC();
		
		System.out.println("CC 클래스 내부 변수 : " + obj1.cc);
	}
}
