import java.io.*;

public class GuGuDan1
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("ù��° �� �Է� : ");
		int first = Integer.parseInt(in.readLine());

		System.out.print("�ι�° �� �Է� : ");
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
