package java_406;


class KimException extends Exception //  Exception ��� �޾Ƽ� ������ ����ó�� ����� ���� ��, super ȣ�� �ʼ�!
{										// ����� ���� Exception Ŭ����

	public KimException(String str) {
		super(str);
	}
}

public class Exception_6 {

	public static void main(String[] args) {
		
		try {
			int xy = (int)(Math.random()*(100-51+1))+51;
			
			if (xy % 5 != 0) {
				throw new KimException("5�� ����� �ƴմϴ�."); // �ڵ� ���ҵ� �ݱ�  �� ���������� ���� �߻�
			}else
				throw new KimException("5�� ����Դϴ�.");
			
		} catch (KimException e) {
			System.out.println(e.getMessage());
		}
	}
}
