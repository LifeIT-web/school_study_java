import java.io.*;

public class  DoWhile_2
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int answer = (int)(Math.random()*(124-50+1))+50; // ���� 78�̸�
		int dapp = 0;
		int count = 0;

		do
		{
			System.out.print("������ �Է��Ͻÿ� !!! ");
			dapp = Integer.parseInt(input.readLine());
			count++;

			if (dapp > answer )
			{
				System.out.println(" ���ڰ� �ʹ� Ů�ϴ�. ");
			}
			if (dapp < answer )
			{
				System.out.println(" ���ڰ� �ʹ� �����ϴ�. ");
		    }
		}
		while (dapp != answer);

		System.out.println("\n\n�����մϴ�. ������ ���߾����ϴ�.");
		System.out.println("�õ� Ƚ�� : " + count);
	}
}