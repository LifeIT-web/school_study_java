package java_331;

class Car_2
{
	String color; //멤버 변수
	String gearType;//멤버 변수
	int door;//멤버 변수
	
	public Car_2() { // 생성자 : 객체생성될 때 초기화 (특징 : 리턴타입 없음)
		
		this("white", "auto", 4); // 자기자신 생성자 1
	}
	
	public Car_2(Car_2 c) //인스턴스 복사를 위한 생성자 <자기자신을 복사하다 옮겨짐>
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
		Car_2 car2 = new Car_2(car1); // car1의 복사본
		
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
