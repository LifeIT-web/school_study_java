package java_401;
//메소드의 오버로딩 메소드 타입 개수 가 다른것이 메소드 오버로딩 
class Overloading{
	
	void display() { //매개 변수 없으
		
		System.out.println("전달된 값 없음");
	}
	
	void display(int a) { // 매개변수 정수형 1개
		System.out.println("a 값은 :" + a);
	}
	void display(String name) { //int 변수명을 kk 바꿔도 위에 있는 a와 같은 값이라 의미 없음 , 타입을 바꾸든가, 변수를 통일
		System.out.println("이름 : " + name);
	}
	void display(String name, int age) {
		System.out.println("이름 : " + name + ", 나이 : " + age);
	}
	void display(String name, int age, String sex) {
		System.out.println("이름 : " + name + ", 나이 : " + age + ", 성별 : " + sex);
	}
	
}




public class OverloadingExe {

	public static void main(String[] args) {
	
		Overloading over = new Overloading();
		
		over.display();
		over.display(27);
		over.display("벚꽃");
		over.display("개나리", 23);
		over.display("국화", 10, "여자");
		
	}
}
