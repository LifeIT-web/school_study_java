package java_408;

class Korea
{
	String kbs;
	
	public Korea(){
		
	}
	
	public Korea(String kbs)
	{
		this.kbs = kbs;
	}
	
	@Override
	public String toString() { // �������̵�  object ��ü���� toString�� �����ϱ�.
		return "������ ������ ~~~~";
	}
}

public class Object_1 {

	public static void main(String[] args) {
		
		Korea obj = new Korea();
	
		Korea obj2 = obj; // �ּҰ��� �Ѱ���.
		
		Korea obj3 = new Korea();
		
		System.out.println("Ŭ���� �̸� : " + obj.getClass());
		System.out.println("�ؽ� �ڵ�1 : " + obj.hashCode()); 
		System.out.println("�ؽ� �ڵ�2 : " + obj2.hashCode()); 
		System.out.println("�ؽ� �ڵ�3 : " + obj3.hashCode()); 
		// ��ü�� ���� ������ �� JVM�Լ��� �ִ� hash�Լ��� ���� ������ �޸𸮻��� ��ġ�� ������ ã������ �ڵ尪 ��ü�� ID (10����)
		System.out.println("��ü ���ڿ� : " + obj.toString());  
		System.out.println("��ü ���ڿ� : " + obj);
		// ��ü�� ���������μ� ���� �ּҰ� 10������ 16������ �ٲ۰� @��  ��ġ (ID)
		
		if (obj.hashCode() == obj2.hashCode()) {
			
			System.out.println("obj1 �� obj2 �� ����.");
		}else
		{
			System.out.println("obj1 �� obj2 �� �޶�");
		}
		if (obj.hashCode() == obj3.hashCode()) {
			
			System.out.println("obj1 �� obj3 �� ����.");
		}else
		{
			System.out.println("obj1 �� obj3 �� �޶�");
		}
	}// ���� ��ü���� �񱳹�
}
