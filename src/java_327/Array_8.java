public class Array_8 
{
	public static void main(String[] args) 
	{
		int[][] var = new int[3][]; //가변 배열 : 다차원 에서 앞은 반드시 채워주고 마지막을 비워두고 새롭게 집어넣는 것

		int i, j, k = 0;

		var[0] = new int[3]; //사이즈 결정
		var[1] = new int[2];
		var[2] = new int[4];

		//초기값 입력

		for (i = 0; i < var.length ; i++ )
		{
			for (j = 0; j < var[i].length ; j++ )
			{
				var[i][j] = k++;
			}
		}

		// 출력

		for (i = 0; i <  var.length ; i++ )
		{	
			for (j = 0; j < var[i].length ;j++ )
			{
				System.out.print(var[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("Lee jiyoon");
	}
}