public class Array_8 
{
	public static void main(String[] args) 
	{
		int[][] var = new int[3][]; //���� �迭 : ������ ���� ���� �ݵ�� ä���ְ� �������� ����ΰ� ���Ӱ� ����ִ� ��

		int i, j, k = 0;

		var[0] = new int[3]; //������ ����
		var[1] = new int[2];
		var[2] = new int[4];

		//�ʱⰪ �Է�

		for (i = 0; i < var.length ; i++ )
		{
			for (j = 0; j < var[i].length ; j++ )
			{
				var[i][j] = k++;
			}
		}

		// ���

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