package java_401;
//�޼ҵ��� �����ε� �޼ҵ� Ÿ�� ���� �� �ٸ����� �޼ҵ� �����ε� 
class Overloading{
	
	void display() { //�Ű� ���� ����
		
		System.out.println("���޵� �� ����");
	}
	
	void display(int a) { // �Ű����� ������ 1��
		System.out.println("a ���� :" + a);
	}
	void display(String name) { //int �������� kk �ٲ㵵 ���� �ִ� a�� ���� ���̶� �ǹ� ���� , Ÿ���� �ٲٵ簡, ������ ����
		System.out.println("�̸� : " + name);
	}
	void display(String name, int age) {
		System.out.println("�̸� : " + name + ", ���� : " + age);
	}
	void display(String name, int age, String sex) {
		System.out.println("�̸� : " + name + ", ���� : " + age + ", ���� : " + sex);
	}
	
}




public class OverloadingExe {

	public static void main(String[] args) {
	
		Overloading over = new Overloading();
		
		over.display();
		over.display(27);
		over.display("����");
		over.display("������", 23);
		over.display("��ȭ", 10, "����");
		
	}
}
