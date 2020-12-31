package java_403;

interface Speed
{
	public int init_speed = 35; // public static final �� ���� �Ұ� ���ȭ�Ȱ�
	public String init_direct = "Straight";
	public void speedUp(int inc); // public abstract ������ ����� ���� ���� 
	//public void speedDown(int inc) {} // ������ ���´�.
	public void speedDown(int inc);
	public void direct(String abc);
}

class Car_3 implements Speed // Car_3 �� Speed�� �����Ѵ�.
{
	int speed = init_speed;
	String ddd = init_direct;
	
	@Override // ������ �ʼ�!
	public void speedUp(int inc) {
		this.speed += inc;
	}

	@Override
	public void speedDown(int inc) {
		this.speed -= inc;
	}
	
	public void display()
	{
		System.out.println(" ���� �ӵ��� " + speed + " km/h �Դϴ�. ");
		System.out.println(" ���� ������ " + ddd + " �Դϴ�. ");
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
