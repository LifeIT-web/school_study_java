public class DoWhile_1 
{
	public static void main(String[] args) 
	{

		int cnt = 1, sum1 = 0, sum2 =0;

		do
		{
			if ( cnt % 2 == 0 )
			{
				sum1 += cnt;
			}
			else
			{
				sum2 += cnt;
			}
		} 
		while (cnt <= 10);
		System.out.println("¦�� �� : " + sum1);
		System.out.println("Ȧ�� �� : " + sum2);
	}
}
