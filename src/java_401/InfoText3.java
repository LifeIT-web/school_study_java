package java_401;

class Info3
{
	String name;
	String address;
	int age;
	
	public Info3(String name, String address, int age)
	{
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public Info3(String name, String address)
	{
		this.name = name;
		this.address = address;
	}
	
	public Info3(String address, int age)
	{
		this.address = address;
		this.age = age;
	}
	
	public Info3()
	{
		
	}
	
	public void show()
	{
		System.out.println("�̸� : " + name);
		System.out.println("�ּ� : " + address);
		System.out.println("���� : " + age);
	}
	
}

public class InfoText3 {

	public static void main(String[] args) {
		
		
		Info3 info1 = new Info3("����ȭ","����",55);
		Info3 info2 = new Info3("�鱹ȭ", "����");
		Info3 info3 = new Info3("�λ�", 23);
		Info3 info4 = new Info3();
		
		
		info1.show();
		System.out.println();
		info2.show();
		System.out.println();
		info3.show();
		System.out.println();
		info4.show();
			
	}
}
