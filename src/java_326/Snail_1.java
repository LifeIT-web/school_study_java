public class Snail_1 
{
	public static void main(String[] args) 
	{
/* 13���� �칰�ӿ� �����̰� �ִµ� ������ 3���� ������ �㿡�� 1���� ������
 ������ Ż������?*/

		int count = 0;
		int snail = 0;

		while (true)
		{
			snail += 3;
			count++;
			if (snail >= 13)
			{
				break;
			}
			snail -= 1;

		}
		System.out.println("���� �Ÿ���  " + snail);
		System.out.println("�ð���  " + count);
	}
}
