public class Array_6 
{
	public static void main(String[] args) 
	{
		int [] score = {65, 45, 89, 32, 53, 99, 76, 39};

		int max = score[0]; //�񱳴���� �ʱⰪ�� �� ���ؾ��ϳ�!!(ȿ������ ���� ����)  -- > �迭 ���� ���� �־��!!
		int min = score[0];//score[0] �ϸ�

		for (int i = 1; i < score.length ;i++ ) // i = 1;�� �ؾ� ȿ��!!
		{
			
			if (score[i] > max)
			{
				max = score[i];
			}

			if(score[i] < min)  // else if�� �ȵ� ������ �������α׷� ������ ������ ���� �� �ִ� ���̴�., if�� ���� ȿ�� x
			{
				min  = score[i];
			}
		}
		
		System.out.println("���� ū �� : " + max );
		System.out.println("���� ���� �� : " + min);
	}
}