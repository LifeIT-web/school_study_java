import java.io.*;

public class GuGuDan_Ex 
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("ù��° �Է� : ");
		int i = Integer.parseInt(in.readLine());

		System.out.print("�ι�° �Է� : ");
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
