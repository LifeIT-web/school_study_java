package java_410;
//���� ��*****
public class String_6 {

	public static void main(String[] args) {
		
		String[] juju = {"731223-1622314",
						 "800122-2365432",
						 "901123-1234567",
						 "970505-2345678",
						 "990321-1234567",
						 "981212-2345678"};
		
		
		for (int i = 0; i < juju.length; i++) {
		
			if (juju[i].substring(7, 8).equals("1")) {  // ���ڿ��� == �� �� �Ұ�(?) -> �����
				System.out.println(juju[i] + " ����");
			}
			else
			{
				System.out.println(juju[i] + " ����");
			}
			
		}
		
		String str = "�ڹٴ� ������ ����ֽ��ϴ�.";
		
		System.out.println(str.substring(1)); // �ε��� 1���� ������ ��� 
		System.out.println(str.substring(4, 7)); // �ε��� 4���� 7�� �ձ��� ���(4~6)
		
	}
}
