package java_403;

interface Bird
{
	public long speed = 80; // 외국에선 이름을 대문자로 쓰는데 인터페이스는 관례상 대문자는 많이 쓰지 않음
	public void fly();
}

interface Horse
{
	public void run();
}

interface Fish
{
	public void swim();
}

class Pegasus implements Bird, Horse, Fish // 다중 상속이 가능하다.
{

	@Override
	public void run() {
		System.out.println("평야를 달린다.");
	}

	@Override
	public void fly() {
		System.out.println("하늘을 날아유!!");	
	}

	@Override
	public void swim() {
		System.out.println("바다를 헤엄쳐유@@");
	}
	
	
}



public class ClassPaga {

	public static void main(String[] args) {
		
		Pegasus obj = new Pegasus();
		
		obj.fly();
		obj.run();
		obj.swim();
	}
}
