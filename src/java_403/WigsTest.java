package java_403;

interface Car
{
	void run();
}

interface Ship
{
	void navigation();
}

interface Mole
{
	void dig();
}

interface Swim
{
	void swimming();
}

interface Wigs extends Car, Ship, Mole, Swim // 다중 상속이 가능하다.
{
	void floating();
}

class EagleFive implements Wigs
{

	@Override
	public void run() {
		System.out.println("평야를 달린다.");
	}

	@Override
	public void navigation() {
		System.out.println("대양을 항해한다.");
	}

	@Override
	public void dig() {
		System.out.println("땅속을 다닌다.");
	}

	@Override
	public void floating() {
		System.out.println("모래밭을 떠다닌다.");
	}

	@Override
	public void swimming() {
		System.out.println("바다를 헤엄친다.");
	}
	
}

public class WigsTest {

	public static void main(String[] args) {
		
		
		Wigs obj = new EagleFive(); // *인터페이스의 형변환* 받을땐 인터페이스 객체로 받아지고 보낼땐 클래스로 보낸다.
		
		obj.dig();
		obj.floating();
		obj.run();
		obj.navigation();
		obj.swimming();
	}
}
