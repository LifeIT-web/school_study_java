public class Lotto_904
{
	public static void main(String[] args)
	{
		
		int[] ball = new int[45];

		for (int i = 0;i < ball.length ;i++ )
		{
			ball[i] = i+1; // 45�� ������ ����
		}

		int tmp = 0;
		int j = 0;

		for (int i = 0; i < 500 ;i++ ) // ���� ���´�.
		{
			j = (int)(Math.random()*45);
			
			tmp = ball[0];
			ball[0] = ball[j];
			ball[j] = tmp;
		}

		System.out.println();
		System.out.println("\n  ��  904 ȸ�� �ζ� ��÷ ��ȣ !!!! \n");

		for (int i = 0; i < 6; i++ )
		{
			System.out.print(ball[i] + "\t");
		}

		System.out.println("\n");
		System.out.println("\n  ���ʽ� ��ȣ !! \n");
		System.out.println("\t\t" + ball[6] + " �Դϴ�. \n\n" );
		
		System.out.println("Lee jiyoon");
	}
}