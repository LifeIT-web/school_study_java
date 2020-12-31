package java_402;

class A_2
{
	void display()
	{
		System.out.println("A_2 클래스의 display()~~~~~~");
	}
}

class B_2 extends A_2
{
	void display() 
	{
		System.out.println("B_2 클래스의 display()@@@@@@");
	}
}



public class Overriding_1 {

	public static void main(String[] args) {
		
		A_2 obj1 = new A_2();
		B_2 obj2 = new B_2();
		A_2 obj3 = new B_2(); //=> 맴버변수는 쉐도잉 맴버메소드는 오버라이딩이 된다. (상속관계일때만 가능)
		
		obj1.display();
		obj2.display();
		obj3.display();
	}
}
