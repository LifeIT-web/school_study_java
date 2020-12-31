package java_403;

interface Speed
{
	public int init_speed = 35; // public static final 값 변경 불가 상수화된것
	public String init_direct = "Straight";
	public void speedUp(int inc); // public abstract 몸통을 만드는 순간 에러 
	//public void speedDown(int inc) {} // 에러가 나온다.
	public void speedDown(int inc);
	public void direct(String abc);
}

class Car_3 implements Speed // Car_3 는 Speed를 구현한다.
{
	int speed = init_speed;
	String ddd = init_direct;
	
	@Override // 재정의 필수!
	public void speedUp(int inc) {
		this.speed += inc;
	}

	@Override
	public void speedDown(int inc) {
		this.speed -= inc;
	}
	
	public void display()
	{
		System.out.println(" 현재 속도는 " + speed + " km/h 입니다. ");
		System.out.println(" 현재 방향은 " + ddd + " 입니다. ");
	}
	
	public void direct(String abc)
	{
		this.ddd = abc;
	}
	
}


public class CarExe {

	public static void main(String[] args) {
		
		Car_3 obj = new Car_3();
		
		obj.display();
		System.out.println();
		
		obj.speedUp(15);
		obj.speedUp(15);
		obj.direct("left");
		
		obj.display();
		
		System.out.println();
		
		obj.speedDown(10);
		obj.speedDown(7);
		obj.direct("right");
		
		obj.display();
		
	}
}
