package java_331;

class Info
{
	private String name; //��� ���� �̸� -> �⺻�� NULL
	private int age; //���� -> �⺻�� 0
	private char sex; //���� -> �񱳹� ������ ����� �ƴϹ��ϴ�.
	private String tel = " "; // -> �ʱⰪ ����
	private String address = " ";// =>�ʱⰪ�� ������ �� ��µ�
	
	
//	public Info() {
//		// ����Ʈ ������ ������ ���� �� -> JVM�� �ڵ����� �������, �Ű����� �ִ� �����ڰ� �ϳ��� ������ ����Ʈ �����ڴ� ������� 
//	}
	
	
//	public Info(String n, int a, char s, String tel, String address) { // ������ (����Ÿ�� ����) , Info(��������)
//		name = n;
//		age = a;
//		sex = s;
//		this.tel = tel; // => this.tel => this : �ʵ��� tel�� ������
//		//tel = tel; �ɹ����� < �������� (�켱����)
//		this.address = address;
//	}
	
	public void display() //��� �޼ҵ� (����Ÿ������)
	{
		String sexx = "";
		
		if (sex == 'f') 
			sexx = "����";
		 
		else if(sex == 'm') 
			sexx = "����";
		 
		else 
			sexx = "����� �ƴϹ��ϴ�";
		
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("���� : " + sexx);
		System.out.println("���� : " + tel);
		System.out.println("�ּ� : " + address);
//		if (sex == 'f') 
//			System.out.println("���� : ����");
//		
//		else
//			System.out.println("���� : ����");
	}
}

public class InfoExe {

	public static void main(String[] args) {
		
		Info info1 = new Info();// info1 �ʱ�ȭ // Info() ����Ʈ ������ ȣ��
		Info info2 = new Info();// info2 �ʱ�ȭ // ("����", 60, "f", "031-546-7894", "��⵵")
		Info info3 = new Info();// info3 �ʱ�ȭ

		info1.display();// info1 ȭ�� ���
		System.out.println();
		info2.display();// info2 ȭ�� ���
		System.out.println();
		info3.display();// info3 ȭ�� ���
		
	}
}
