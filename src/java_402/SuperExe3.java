package java_402;

class A_5
{
	int a = 0;
	
	public A_5(int a) {
		this.a = a;
		
		System.out.println("A_5() ������ ����~~~~~~");
	}
	
}

class B_5 extends A_5
{
	public B_5(int b) {
		super(b);
		System.out.println("B_5() ������ ����~~~~@~");
	}
}

class C_5 extends B_5
{
	public C_5(int c) {
		super(c);
		System.out.println("C_5() ������ ����~~~~!");
	}
}
// A�� ���� ���������, B ���� C�� �������
public class SuperExe3 {

	public static void main(String[] args) {
		
		C_5 obj = new C_5(79);
		A_5 obj2 = new C_5(7);
		
		System.out.println("a = " + obj.a);
		System.out.println("a = " + obj2.a);
	}
}
