package java_402;

class 차 //모든 클래스는 최상위 클래스 Object가 있다  생략 되어 있을 뿐 (extends Object)
{
	
}

class 불자동차 extends 차
{
	
}

class 수륙양용차
{
	
}

public class InstanceOfTest {

	public static void main(String[] args) {
	
		불자동차 obj = new 불자동차();
		수륙양용차 obj2 = new 수륙양용차();
		
		if (obj2 instanceof Object) { // 상속받은 객체인지 판별
			
			System.out.println("This is a 불자동차 인스턴스~~~~");
		}
		
		if (obj instanceof 차) {
			System.out.println("This is a 차 인스턴스~~~~");
		}
		
		if (obj instanceof Object) {
			System.out.println("This is a Object 인스턴스~~~~");
		}
	}
}
