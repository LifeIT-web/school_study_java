public class For_1 
{
	public static void main(String[] args) 
	{
		int cnt , sum = 0;
		int odd = 0;
		int even = 0;
		int third = 0;

		for (cnt = 1 ;cnt <= 100  ; cnt++ )
		{
			sum += cnt;

			if (cnt % 2 == 0)
			{
				even += cnt;
			}
			else
			{
				odd += cnt;
			}
			if(cnt % 3 == 0)
			{
				third += cnt;
			}
		}
		System.out.println("짝수의 합 : " + even);
		System.out.println("홀수의 합 : " + odd);
		System.out.println("3의 배수의 합 : " + third);
		
	}
}
