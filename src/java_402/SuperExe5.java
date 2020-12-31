package java_402;

class Parent
{
	int x = 777;
	
	void message()
	{
	
	}
}

class Child extends Parent
{
	int x = 9999;
	
	void message() {
		System.out.println(" x = " + x);
		System.out.println(" this.x = " + this.x);
		System.out.println(" super.x = " + super.x);
	}
}





public class SuperExe5 {

	public static void main(String[] args) {
		
		Parent obj = new Child();
		
		obj.message(); // Child의 메시지가 나오고
		System.out.println(" x = " + obj.x); // Parent의 값이 나옴
		
		//이걸 클래스는 쉐도잉이 되고, 메소드는 오버라이딩의 값이 나온다.
	}
}
