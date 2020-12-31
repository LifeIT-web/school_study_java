package java_401;

class Card_1
{
	
	final int NUMBER;
	final String KIND;
	
	static int width = 100;
	static int height = 250;
	
	public Card_1(String kind, int number)
	{
		KIND = kind;
		NUMBER = number;
	}
	
	public Card_1() {

		this("HEART", 1);
	}
	
	public String toString() // 자동 호출 // 모든 클래스의 슈퍼클래스는 오브젝트 (상속받아서 쓸수 있다) =>  오버라이딩(재정의) 현재 가지고 있는 값이 뿌려짐
	{
		return "" + KIND + "" + NUMBER; 
	}
	
}


public class FinalCard_1 {

	public static void main(String[] args) {
		
		Card_1 card1 = new Card_1("SPADE", 10);
		Card_1 card2 = new Card_1();
		
		System.out.println(card1); //해시 코드 = 주소 코드 => toString (주석처리하면 패키지명.클래스명@주소명 출력) 원래는 object 근데 card에서 호출하면 슈퍼클래스에서 재정의한 오버라이딩이 나온것
		System.out.println(card2);
				
		//card1. + ctrl.spacebar 하면 클래스 오브젝트 맴버 등 쓸수 있는게 나옴
		
		System.out.println(card1.KIND);
		System.out.println(card2.KIND);
		
		System.out.println(card1.NUMBER);
		System.out.println(card2.NUMBER);
	}
}
