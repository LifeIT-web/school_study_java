package java_402;

class A_5
{
	int a = 0;
	
	public A_5(int a) {
		this.a = a;
		
		System.out.println("A_5() 생성자 실행~~~~~~");
	}
	
}

class B_5 extends A_5
{
	public B_5(int b) {
		super(b);
		System.out.println("B_5() 생성자 실행~~~~@~");
	}
}

class C_5 extends B_5
{
	public C_5(int c) {
		super(c);
		System.out.println("C_5() 생성자 실행~~~~!");
	}
}
// A가 먼저 만들어지고, B 다음 C가 만들어짐
public class SuperExe3 {

	public static void main(String[] args) {
		
		C_5 obj = new C_5(79);
		A_5 obj2 = new C_5(7);
		
		System.out.println("a = " + obj.a);
		System.out.println("a = " + obj2.a);
	}
}
