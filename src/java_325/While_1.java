public class While_1 
{
	public static void main(String[] args) 
	{
		int cnt = 0, sum = 0, even = 0, odd = 0;

		while (cnt < 10)
		{
			cnt++;
			sum += cnt;
			if (cnt %  2 == 0)
			{
				even += cnt;
			}
			else
			{
				odd += cnt;
			}
			//cnt++; ==> (cnt <= 10)
		}
		System.out.println("  1 ~ 10������ �� : " + sum);
		System.out.println("  ¦���� �� : " + even);
		System.out.println("  Ȧ���� �� : " + odd);
		System.out.println("  Lee jiyoon");
	}
}
