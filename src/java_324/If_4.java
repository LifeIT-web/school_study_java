public class	If_4	
{
	public static void main(String args[])	throws Exception
	{
		int ch;
		
		System.out.print("���ڸ� �Է��ϼ� ");

		ch = System.in.read();

		if (ch == 65 || ch == 97)
		{
			System.out.println("America");
			System.out.println("Australia");
		}
		else if (ch == 'K' || ch == 'k')
		{
			System.out.println("Korea");
			System.out.println("Kuwait");
		}
		else if (ch == 'M' || ch == 'm')
		{
			System.out.println("Mexico");
			System.out.println("Monaco");
		}
		System.out.println("Lee jiyoon");
	}
}