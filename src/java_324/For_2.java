public class For_2 
{
	public static void main(String[] args) 
	{

		long startTime = System.currentTimeMillis();

	System.out.println("자 지금부터 카운트 다운을 시작합니다.");

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

	System.out.println("\t\t\t\t  게임종료!!!");
		long endTime = System.currentTimeMillis();

		System.out.println("시작 시간 : " + startTime);
		System.out.println("종료 시간 : " + endTime);
		System.out.println("소요 시간 : " + (endTime - startTime));
		//System.out.println("Lee jiyoon");
	}
}
