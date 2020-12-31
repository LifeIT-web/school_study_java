public class Ex_1 
{
	public static void main(String[] args) 
	{
		int day = 1;
		int go = 0;
		

		while(true)
		{
			go += 3;

			if (go < 13)
			{
				go -= 1;
				day++;
			}
			else
				break;
		}
		System.out.println("걸리는 시간 : "+day);
	}
}
            