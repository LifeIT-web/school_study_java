package java_403;

abstract class 도형 // 추상 클래스 , 단독으로 객체화 불가
{
	int i = 10; //멤버 변수
	abstract void draw(); // 추상메소드
	
}

class 사각형 extends 도형 // 추상메소드 재정의해서 그다음에 객체화 가능
{
	@Override
	void draw() {
		System.out.println("사각형을 그립니다.");
	}
	
}

class 삼각형 extends 도형
{

	@Override
	void draw() {
		System.out.println("삼각형을 그립니다.");
	}
	
}

class 원형 extends 도형
{

	@Override
	void draw() {
		System.out.println("둥근 원을 그립니다.");
	}
	
}

class 오각형 extends 도형
{

	@Override
	void draw() {
		System.out.println("오각형을 그립니다.");
	}
	
}


public class Abstract_1 {

	public static void main(String[] args) {
		
		// 도형 obj1 = new 사각형();  맴버변수는 쉐도잉 되고 맴버메소드는 오버라이딩된다.
		사각형 obj1 = new 사각형();
		삼각형 obj2 = new 삼각형();
		원형 obj3 = new 원형();
		오각형 obj4 = new 오각형();
		
		System.out.println();
		
		obj1.draw();
		obj2.draw();
		obj3.draw();
		obj4.draw();
		
		System.out.println("===================");
	
		도형 obj5 = new 사각형();
		obj5.draw();
		
		obj5 = new 삼각형();
		obj5.draw();
		
		obj5 = new 원형();
		obj5.draw();
		
		obj5 = new 오각형();
		obj5.draw();
		
		System.out.println("=====================");
	
	}
}
