package java_331;

class Info
{
	private String name; //멤버 변수 이름 -> 기본값 NULL
	private int age; //나이 -> 기본값 0
	private char sex; //성별 -> 비교문 때문에 사람이 아니무니다.
	private String tel = " "; // -> 초기값 공백
	private String address = " ";// =>초기값을 넣으면 다 출력됨
	
	
//	public Info() {
//		// 디폴트 생성자 있으나 마나 함 -> JVM이 자동으로 만들어줌, 매개변수 있는 생성자가 하나라도 있으면 디폴트 생성자는 없어야함 
//	}
	
	
//	public Info(String n, int a, char s, String tel, String address) { // 생성자 (리턴타입 없으) , Info(지역변수)
//		name = n;
//		age = a;
//		sex = s;
//		this.tel = tel; // => this.tel => this : 필드의 tel이 나오게
//		//tel = tel; 맴버변수 < 지역변수 (우선순위)
//		this.address = address;
//	}
	
	public void display() //멤버 메소드 (리턴타입잇으)
	{
		String sexx = "";
		
		if (sex == 'f') 
			sexx = "여자";
		 
		else if(sex == 'm') 
			sexx = "남자";
		 
		else 
			sexx = "사람이 아니무니다";
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + sexx);
		System.out.println("전번 : " + tel);
		System.out.println("주소 : " + address);
//		if (sex == 'f') 
//			System.out.println("성별 : 여자");
//		
//		else
//			System.out.println("성별 : 남자");
	}
}

public class InfoExe {

	public static void main(String[] args) {
		
		Info info1 = new Info();// info1 초기화 // Info() 디폴트 생성자 호출
		Info info2 = new Info();// info2 초기화 // ("수소", 60, "f", "031-546-7894", "경기도")
		Info info3 = new Info();// info3 초기화

		info1.display();// info1 화면 출력
		System.out.println();
		info2.display();// info2 화면 출력
		System.out.println();
		info3.display();// info3 화면 출력
		
	}
}
