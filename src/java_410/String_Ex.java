package java_410;

public class String_Ex {

	public static void main(String[] args) {
		
		String[] juju = {"731223-1622314",
				 		 "800122-2365432",
				 		 "901123-1234567",
				 		 "970505-2345678",
				 		 "990321-1234567",
				 		 "981212-2345678"};

		//2000�⵵ ���� �ֹ� ��ȣ ���ڸ� 3 , 4
		for (int i = 0; i < juju.length; i++) {
			
			if (juju[i].lastIndexOf("1", 7) == 7 || juju[i].indexOf("3", 7) == 7)  
			{  
				System.out.println(juju[i] + " ����");
			}
			
			else
			{
				System.out.println(juju[i] + " ����");
			}
			
		}
	}
}
// substring, Indexof, charAt �ֹε�Ϲ�ȣ ã���� ���� ����.
// �� �߿��� substring�� ���� ����.