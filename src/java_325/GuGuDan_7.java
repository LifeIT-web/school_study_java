import java.io.*;

public class GuGuDan_7 
{
	public static void main(String[] args)  throws Exception
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.print("첫 수를 입력 : ");
		int ship = (int)((9-2+1)*Math.random()+2);
		System.out.println(ship);
		
		System.out.print("두 수를 입력 : ");
		int forr = (int)((9-2+1)*Math.random()+2);//2~9 안의 값
		System.out.println(forr);
		
		int i = 1;
		
		if (ship > forr)
		{
			int temp = ship;
				ship = forr;
				forr = temp;
		}
		do
		{
			do
			{
				System.out.println(" "+ ship + "*" + "" + i + "=" + (ship*i));
				i++;
			}
			while (i < 10);
			i = 1;
			ship++;
			System.out.println();
		}
		while (ship <= forr);
		System.out.println("Lee jiyoon");
	}
}
