package java_408;

class Korea
{
	String kbs;
	
	public Korea(){
		
	}
	
	public Korea(String kbs)
	{
		this.kbs = kbs;
	}
	
	@Override
	public String toString() { // 오버라이딩  object 자체에도 toString이 있으니까.
		return "오늘은 보름달 ~~~~";
	}
}

public class Object_1 {

	public static void main(String[] args) {
		
		Korea obj = new Korea();
	
		Korea obj2 = obj; // 주소값을 넘겨줌.
		
		Korea obj3 = new Korea();
		
		System.out.println("클래스 이름 : " + obj.getClass());
		System.out.println("해쉬 코드1 : " + obj.hashCode()); 
		System.out.println("해쉬 코드2 : " + obj2.hashCode()); 
		System.out.println("해쉬 코드3 : " + obj3.hashCode()); 
		// 객체가 갖는 유일한 값 JVM함수에 있는 hash함수에 의해 생성한 메모리상의 위치를 빠르게 찾기위한 코드값 객체의 ID (10진수)
		System.out.println("객체 문자열 : " + obj.toString());  
		System.out.println("객체 문자열 : " + obj);
		// 객체가 생성됨으로서 생긴 주소값 10진수를 16진수로 바꾼값 @뒤  위치 (ID)
		
		if (obj.hashCode() == obj2.hashCode()) {
			
			System.out.println("obj1 과 obj2 는 같다.");
		}else
		{
			System.out.println("obj1 과 obj2 는 달라");
		}
		if (obj.hashCode() == obj3.hashCode()) {
			
			System.out.println("obj1 과 obj3 는 같다.");
		}else
		{
			System.out.println("obj1 과 obj3 는 달라");
		}
	}// 같은 객체인지 비교문
}
