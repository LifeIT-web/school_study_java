package java_401;
// ������ �����ε� ��
class Info2
{
	private String name; //�������
	private int age;
	private char sex;
	private String tel;
	
	public Info2(String n, int a, char s, String t) { // ������
		name = n;
		age = a;
		sex = s;
		tel = t;
	}
	
	public Info2(String n, int a) { // ������
		name = n;
		age = a;
		sex = 'f';
		tel = "010-4546-4546";
	}
	
	public Info2(String n, char s, String t) { //������
		name = n;
		age = 77;
		sex = s;
		tel = t;
	}
	
	public Info2(int a, char s, String t) { //������
		name = "Anonymous";
		age = a;
		sex = s;
		tel = t;
	}
	
	public Info2() { //������
		name = "����";
		age = 33;
		sex = 'f';
		tel = "010-7897-7897";
	}
	//�Ȱ��� �̸��� �޼ҵ���� => �����ε�
	
	
	public void display() { //��� �޼ҵ�
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("���� : " + sex);
		System.out.println("���� : " + tel + "\n");
	}
	
}


public class InfoTest_2 {

	public static void main(String[] args) {
		
		Info2 info1 = new Info2("ȫ�浿", 35, 'm', "");
		Info2 info2 = new Info2("�عٶ��", 22);
		Info2 info3 = new Info2("�鱹ȭ",'f');
		Info2 info4 = new Info2(34, 'm', "010-9639-7122");
		Info2 info5 = new Info2();
		
		info1.display();
		info2.display();
		info3.display();
		info4.display();
		info5.display();
		
	}
}
