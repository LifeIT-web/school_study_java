package java_402;

class �� //��� Ŭ������ �ֻ��� Ŭ���� Object�� �ִ�  ���� �Ǿ� ���� �� (extends Object)
{
	
}

class ���ڵ��� extends ��
{
	
}

class ���������
{
	
}

public class InstanceOfTest {

	public static void main(String[] args) {
	
		���ڵ��� obj = new ���ڵ���();
		��������� obj2 = new ���������();
		
		if (obj2 instanceof Object) { // ��ӹ��� ��ü���� �Ǻ�
			
			System.out.println("This is a ���ڵ��� �ν��Ͻ�~~~~");
		}
		
		if (obj instanceof ��) {
			System.out.println("This is a �� �ν��Ͻ�~~~~");
		}
		
		if (obj instanceof Object) {
			System.out.println("This is a Object �ν��Ͻ�~~~~");
		}
	}
}
