public class For_2 
{
	public static void main(String[] args) 
	{

		long startTime = System.currentTimeMillis();

	System.out.println("�� ���ݺ��� ī��Ʈ �ٿ��� �����մϴ�.");

	for (int tt = 10; tt > 0 ; tt-- )
	{
	
		for (int i = 0	; i < 2000000 ; i++ )
		{
			for (int k = 0; k < 1500 ; k++ )
			{
				for (int j = 0; j < 2000 ; j ++ )
				{
					;
				}
				
			}
		}
		System.out.println("\t\t\t\t" + tt); 
	}

	System.out.println("\t\t\t\t  ��������!!!");
		long endTime = System.currentTimeMillis();

		System.out.println("���� �ð� : " + startTime);
		System.out.println("���� �ð� : " + endTime);
		System.out.println("�ҿ� �ð� : " + (endTime - startTime));
		//System.out.println("Lee jiyoon");
	}
}
