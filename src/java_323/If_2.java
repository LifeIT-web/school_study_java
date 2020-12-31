import java.io.*;

public class If_2 
{
	public static void main(String[] args) throws Exception
	{

		BufferedReader an = new BufferedReader(new InputStreamReader(System.in));
		int grade = 0;
		
		System.out.print("점수를 입력하시오 : ");
		
		grade = Integer.parseInt(an.readLine());

		if (grade >= 90)
		{
			System.out.println("성적은 A");
		}
		else if (grade >= 80)
		{
			System.out.println("성적은 B");
		}
		else if (grade >= 70)
		{
			System.out.println("성적은 C");
		}
		else if (grade >= 60)
		{
			System.out.println("성적은 D");
		}
		else 
		{
			System.out.println("성적은 F");
		}
		System.out.println("Lee jiyoon");
	}
}
