import java.io.*;

public class GuGuDan1
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("첫번째 수 입력 : ");
		int first = Integer.parseInt(in.readLine());

		System.out.print("두번째 수 입력 : ");
		int second = Integer.parseInt(in.readLine());

		int temp = 0;
		
		
		if (first > second)
		{
			temp = first;
			first =second;
			second = temp;
		}
		for (int i = first ; i <= second ; i++ )
		{
				for (int j = 1; j <=9 ; j++ )
				{
					System.out.println(i + "*" + j + "="+ (i*j));
				}
			}

		
	}
}
