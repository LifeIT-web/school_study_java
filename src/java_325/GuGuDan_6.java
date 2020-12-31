public class GuGuDan_6 
{
	public static void main(String[] args) 
	{
		int i = 2, j = 1;

		do
		{
			do
			{
				System.out.println(""+ i +"*"+ j+"="+(i*j));
				j++;
			}
			while (j < 10);
			i++;
			j= 1;
			System.out.println();
		}
		while (i < 10);
		System.out.println("Lee jiyoon");
	}
}
