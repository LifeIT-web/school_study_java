import java.io.*;

public class GuGuDan_4 
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("첫번째 입력 : ");
		int first = Integer.parseInt(input.readLine()); //4

		System.out.print("두번째 입력 : ");
		int second = Integer.parseInt(input.readLine());//6
		
		int cnt = 1;
		
		if(first > second)
		{
			int temp = first;
			first = second;
			second = temp;
		}
		while (first <= second)
		{
			while (cnt <= 9)
			{
				System.out.println(first + "*" + cnt +"="+ (first*cnt));
				cnt++;
			}
			cnt = 1;
			first++;  
			}
		System.out.println("Lee jiyoon");
	}
}
