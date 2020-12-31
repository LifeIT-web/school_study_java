package java_402;

class A_8
{
	int a = 10;
//	public A_8() {
//		super(); // object 클래스가 부모다!!
//	}
}

class B_8 extends A_8
{
	int b = 20;
//	public B_8() {
//		super();
//	}

}

class C_8 extends B_8
{
	int c = 30;
//	public C_8() {
//		super();		=> 생략되어 있다.
//	}

}


public class Convert_2 {

	public static void main(String[] args) {
		
		C_8 obj = new C_8();
		
		C_8 obj2 = null;
		
		C_8 obj3 = (C_8) new A_8(); // 캐스팅 방법 
		
		
		obj2 = (C_8)obj3; // obj3 이 큰거 obj2 작은거 그래서 (C_8)캐스팅 모든 객체는 object로 형변환이 가능하다.
		
		
		System.out.println(" a = " + obj.a);
		System.out.println(" b = " + obj.b);
		System.out.println(" c = " + obj.c);
	}
}
