import java.io.*;

public class If_2 
{
	public static void main(String[] args) throws Exception
	{

		BufferedReader an = new BufferedReader(new InputStreamReader(System.in));
		int grade = 0;
		
		System.out.print("������ �Է��Ͻÿ� : ");
		
		grade = Integer.parseInt(an.readLine());

		if (grade >= 90)
		{
			System.out.println("������ A");
		}
		else if (grade >= 80)
		{
			System.out.println("������ B");
		}
		else if (grade >= 70)
		{
			System.out.println("������ C");
		}
		else if (grade >= 60)
		{
			System.out.println("������ D");
		}
		else 
		{
			System.out.println("������ F");
		}
		System.out.println("Lee jiyoon");
	}
}
