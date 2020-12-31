package java_403;

class A_9
{
	//final void display()
	final void display()
	{
		System.out.println(" 재정의 불가 메소드 ~~~~~~");
	}
}

class B_9 extends A_9
{
	void display1()
	{
		System.out.println(" 재정의 한 메소드 @@@@@@@");
	}
}

public class FinalMethod {

	public static void main(String[] args) {
		
		A_9 obj = new A_9();
		B_9 obj2 = new B_9();
		
		obj.display();
		obj2.display();
		obj2.display1();
	}
	
}
