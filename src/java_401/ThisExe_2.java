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

		this("����ȭ", 33, 'm');
		System.out.println("This_2() ��ü ����~~");
		// ��ü�� ���� ��������� ���� ����Ʈ ���� �Ǿ�ߵ�
		// ��ü�� ����������� �ʰ� ����Ʈ ������ �ϸ� �ȵȴ�.(��)
		// ��ü�� ����������� �ʾҴµ� ����Ʈ ������ �Ұ��� (=super�� ��������)
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
		System.out.println("�̸� : " + name + "\n���� : " + age + "\n���� : " + sex);
	}
	
}

public class ThisExe_2 {
	
	public static void main(String[] args) {
	
		This_2 tt1 = new This_2();
		This_2 tt2 = new This_2("����", 23);
		This_2 tt3 = new This_2("�з��̲�", 'f');
		This_2 tt4 = new This_2("�޸��̲�", 34, 'f');
		
		tt1.display();
		System.out.println();
		tt2.display();
		System.out.println();
		tt3.display();
		System.out.println();
		tt4.display();
		
	
	}
	
}
