package java_410;

public class String_12 {

	public static void main(String[] args) {
		
		String str = "���� ���� ���� �ָ� ����. ���� �Ͼ�� ���� ���̸� �ݴ´�.";//34
		
		System.out.println("�˻��� ���ڿ� \n" + str);
		System.out.println("indexOf(��) : " + str.indexOf("��")); 
		// ����� ���ڰ� �ε��� ���°���ִ��� �˷���
		System.out.println("indexOf(��, 10) : " + str.indexOf("��" ,10));
		// ù�ε���(ù�ڸ���) 10�� ���ķ� ������ ���� ���°�� �ִ��� �˷���
		System.out.println("lastIndexOf(��) : " + str.lastIndexOf("��"));
		// ���ε���(���ڸ���)���� ������ ����� ���ڰ� ���°�� �ִ��� 
		System.out.println("lastIndexOf(��, 10) : " + str.lastIndexOf("��", 10));
		// 10�� �������� �� �ؿ��ִ� "��"�� �ε����� ���° �ִ���							//������ġ
		// ������� ������ -1�� ����
	}
}
