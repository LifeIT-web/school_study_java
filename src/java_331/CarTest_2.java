package java_331;

class Car_2
{
	String color; //��� ����
	String gearType;//��� ����
	int door;//��� ����
	
	public Car_2() { // ������ : ��ü������ �� �ʱ�ȭ (Ư¡ : ����Ÿ�� ����)
		
		this("white", "auto", 4); // �ڱ��ڽ� ������ 1
	}
	
	public Car_2(Car_2 c) //�ν��Ͻ� ���縦 ���� ������ <�ڱ��ڽ��� �����ϴ� �Ű���>
	{
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
	
	public Car_2(String c, String g, int d) //2
	{
		color = c;
		gearType = g;
		door = d;
	}
}


public class CarTest_2 {

	public static void main(String[] args) {
		
		Car_2 car1 = new Car_2();
		Car_2 car2 = new Car_2(car1); // car1�� ���纻
		
		System.out.println("car1 color : "+car1.color + 
							" car1 gearType : "+car1.gearType+	
							" car1 door : "+car1.door);
		
		System.out.println("car2 color : "+car2.color + 
				" car2 gearType : "+car2.gearType+	
				" car2 door : "+car2.door);
		
		car1.door = 457;
		
		System.out.println("==============================");
		
		System.out.println("car1 color : "+car1.color + 
				" car1 gearType : "+car1.gearType+	
				" car1 door : "+car1.door);

		System.out.println("car2 color : "+car2.color + 
				" car2 gearType : "+car2.gearType+	
				" car2 door : "+car2.door);
	}
}
