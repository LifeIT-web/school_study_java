public class Switch_1 
{
	public static void main(String[] args) throws Exception 
	{

		int a;

		System.out.print("1~9������ ���� �Է��Ͻÿ� ");
		a = System.in.read()-48;
/* 
		

	switch ���� ���� ������ ������ �ڷ�(��������) �̾�� �Ѵ�.

	.case ���� ���Ǵ� ���� ������ �� ���� ���� ��밡��
	. if �� ó�� ������ ����Ҽ� ����
	. case ���� ���๮�� ������ ��������
	 �߰�ȣ({})�� ����Ҽ� ����
	 break���� ������ ���� case ������ �Ѿ

*/
		switch (a)
		{
		case 1:
			System.out.println(a + " �� Ȧ�� �Դϴ�.");
		case 3:
		case 5:
		case 7:
		case 9:
			System.out.println(a + " �� Ȧ�� �Դϴ�.");
			break;

		default : 
			System.out.println(a + " �� ���� �Դϴ�.");
			break;

		case 2:
		case 4:
		case 6:
		case 8:
			System.out.println(a + " �� ¦�� �Դϴ�.");
			break;
		}
		System.out.println("Lee jiyoon");
	}
}
