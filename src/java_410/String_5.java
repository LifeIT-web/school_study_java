package java_410;

public class String_5 {

	public static void main(String[] args) {
		
	
	String str = "���� �ʺ���! �ڹ� ���� �ƴϳ�!";
	
	boolean flag = str.startsWith("�����ʺ���!"); // str�� ���� �����! ��� �����߳�? 
	System.out.println(flag);
	
	flag = str.startsWith("����"); // str�� �������� �����߳�?
	System.out.println(flag);
	
	flag = str.endsWith("���� �ƴϳ�"); // str�� ���� �ƴϳ׷� ������?
	System.out.println(flag);
	
	flag = str.endsWith("���� �ƴϳ�!"); // str�� ���� �ƴϳ�!�� ������?
	System.out.println(flag);
	
	}
}
