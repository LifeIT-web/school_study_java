package java_402;

class A_2
{
	void display()
	{
		System.out.println("A_2 Ŭ������ display()~~~~~~");
	}
}

class B_2 extends A_2
{
	void display() 
	{
		System.out.println("B_2 Ŭ������ display()@@@@@@");
	}
}



public class Overriding_1 {

	public static void main(String[] args) {
		
		A_2 obj1 = new A_2();
		B_2 obj2 = new B_2();
		A_2 obj3 = new B_2(); //=> �ɹ������� ������ �ɹ��޼ҵ�� �������̵��� �ȴ�. (��Ӱ����϶��� ����)
		
		obj1.display();
		obj2.display();
		obj3.display();
	}
}
