package java_401;
// 생성자 오버로딩 예
class Info2
{
	private String name; //멤버변수
	private int age;
	private char sex;
	private String tel;
	
	public Info2(String n, int a, char s, String t) { // 생성자
		name = n;
		age = a;
		sex = s;
		tel = t;
	}
	
	public Info2(String n, int a) { // 생성자
		name = n;
		age = a;
		sex = 'f';
		tel = "010-4546-4546";
	}
	
	public Info2(String n, char s, String t) { //생성자
		name = n;
		age = 77;
		sex = s;
		tel = t;
	}
	
	public Info2(int a, char s, String t) { //생성자
		name = "Anonymous";
		age = a;
		sex = s;
		tel = t;
	}
	
	public Info2() { //생성자
		name = "무명씨";
		age = 33;
		sex = 'f';
		tel = "010-7897-7897";
	}
	//똑같은 이름의 메소드들을 => 오버로딩
	
	
	public void display() { //멤버 메소드
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + sex);
		System.out.println("전번 : " + tel + "\n");
	}
	
}


public class InfoTest_2 {

	public static void main(String[] args) {
		
		Info2 info1 = new Info2("홍길동", 35, 'm', "");
		Info2 info2 = new Info2("해바라기", 22);
		Info2 info3 = new Info2("들국화",'f');
		Info2 info4 = new Info2(34, 'm', "010-9639-7122");
		Info2 info5 = new Info2();
		
		info1.display();
		info2.display();
		info3.display();
		info4.display();
		info5.display();
		
	}
}
