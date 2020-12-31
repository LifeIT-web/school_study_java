package java_409;

class Person
{
	long id;
	
	@Override // object 안에 있는 equals 를 오버라이딩 함.
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Person) { // 객체가 있다면
			return id == ((Person)obj).id; // person으로 캐스팅 한 obj의 값이 같냐?
			//obj 가 Object 타입이므로 id 값을 참조하기 위해서는
			//Person 타입으로 형변환이 필요하다.

		}else {
			return false; // 타입이 Person 이 아니면 값을 비교할 필요가 없다.
		}
	}
	
	public Person(long id) {

		this.id = id;
	
	}
}




public class EqualsTest {

	public static void main(String[] args) {
		
		Person pp1 = new Person(202004090927L);
		Person pp2 = new Person(202004090927L);
		
		if (pp1 == pp2) { //주소값이 같냐
			System.out.println("pp1과 pp2는 같은 사람입니다.");
		}
		else 
		{
			System.out.println("pp1과 pp2는 다른 사람입니다.");
		}
		if(pp1.equals(pp2)) // 각각 객체 안에 있는 값이 같냐
		{
			System.out.println("pp1과 pp2는 같은 사람입니다다다다다다다.");
		}
		else
		{	
			System.out.println("pp1과 pp2는 다른 사람입니다다다다다다다.");
		}
	}
}
