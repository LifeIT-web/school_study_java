import java.io.*;

public class  DoWhile_2
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int answer = (int)(Math.random()*(124-50+1))+50; // 만약 78이면
		int dapp = 0;
		int count = 0;

		do
		{
			System.out.print("정답을 입력하시오 !!! ");
			dapp = Integer.parseInt(input.readLine());
			count++;

			if (dapp > answer )
			{
				System.out.println(" 숫자가 너무 큽니다. ");
			}
			if (dapp < answer )
			{
				System.out.println(" 숫자가 너무 적습니다. ");
		    }
		}
		while (dapp != answer);

		System.out.println("\n\n축하합니다. 정답을 맞추었습니다.");
		System.out.println("시도 횟수 : " + count);
	}
}