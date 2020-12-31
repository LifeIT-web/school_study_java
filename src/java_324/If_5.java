package java_324;

public class If_5 
{
	public static void main(String[] args) 
	{

		int score = 0;

		for (int i =1; i <= 10 ;i++ )
		{
			score = (int)(Math.random() * 75) - 75; // -75 ~ -1���ڰ� ���´�.
			
			System.out.print("\t" + score);

			if (i  % 10 == 0)
			{
				System.out.println();
			}
		}
		System.out.println("Lee jiyoon");
	}
}
