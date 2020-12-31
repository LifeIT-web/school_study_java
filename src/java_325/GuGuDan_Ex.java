import java.io.*;

public class GuGuDan_Ex 
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("첫번째 입력 : ");
		int i = Integer.parseInt(in.readLine());

		System.out.print("두번째 입력 : ");
		int j = Integer.parseInt(in.readLine());

		if (i>j)
		{
			int tmp = i;
			i = j;
			j = tmp;
		}
		
		int cnt = 1;

		do
		{
			do
			{
				System.out.println(i+"*"+cnt +"="+ (i * cnt));
				cnt++;
			}
			while (cnt <= 9);
			cnt = 1;
			i++;
		}
		while (i <= j);
		System.out.println("Lee jiyoon");
	}
}
