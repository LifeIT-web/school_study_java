package java_401;

class This_2
{
	String name;
	int age;
	char sex;
	
	public This_2(String name, int age, char sex) {

		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public This_2() {

		this("수선화", 33, 'm');
		System.out.println("This_2() 객체 생성~~");
		// 객체가 먼저 만들어지고 나서 프린트 실행 되어야됨
		// 객체가 만들어지지도 않고 프린트 실행은 하면 안된다.(룰)
		// 객체가 만들어지지도 않았는데 프린트 수행은 불가능 (=super도 마찬가지)
	}
	
	public This_2(String name, int age)
	{
		this(name, age, 'f');
	}
	
	public This_2(String name, char sex)
	{
		this(name, 27, sex);
	}
	

	public void display()
	{
		System.out.println("이름 : " + name + "\n나이 : " + age + "\n성별 : " + sex);
	}
	
}

public class ThisExe_2 {
	
	public static void main(String[] args) {
	
		This_2 tt1 = new This_2();
		This_2 tt2 = new This_2("백합", 23);
		This_2 tt3 = new This_2("패랭이꽃", 'f');
		This_2 tt4 = new This_2("달맞이꽃", 34, 'f');
		
		tt1.display();
		System.out.println();
		tt2.display();
		System.out.println();
		tt3.display();
		System.out.println();
		tt4.display();
		
	
	}
	
}
