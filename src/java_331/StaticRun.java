package java_331;

class Static_1
{
	static int num1 = 0;
	static int num2 = 0;
	int a = 10;
	int b = 20;
}


public class StaticRun {

	public static void main(String[] args) {
		
		Static_1 ss1 = new Static_1();
		Static_1 ss2 = new Static_1();
		
		Static_1.num1 = 77;
		Static_1.num2 = 100;
		ss1.a = 33;
		ss1.b = 44;
		
		System.out.println("ss1 num1 : " + Static_1.num1 + " ss1 num2 : " + Static_1.num2 + ","
				+ " ss1 a : " + ss1.a
				+ ", ss1 b : " + ss1.b);
		System.out.println("ss2 num1 : " + Static_1.num1 + " ss2 num2 : " + Static_1.num2 + ","
				+ " ss2 a : " + ss2.a
				+ ", ss2 b : " + ss2.b);
		
		System.out.println(" Static º¯¼ö num = " + Static_1.num1);
	}
}
