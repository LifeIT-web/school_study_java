package java_406;

public class Exception_2 {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);

		try {
			System.out.println(3);
			System.out.println(0 / 0); // ���� , �Ҵ�(10 / 0) = > ������ �߻��ϸ� sysout(4), (4.5)�� ���� �ȵǰ� catch�κ����� ���� �����
			System.out.println(4);
			System.out.println(4.5);
			//������ ������ catch�κ��� �Ѱ��.
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(5);
			System.out.println(6);
		}
		finally {
			System.out.println(6.5);
		}

		System.out.println(7);
		System.out.println(8);
	}
}
// �����Ҷ����� ���� �޼����� ���� �ٲ�� ������ �����尡 ���� �ֱ� �����̴�.