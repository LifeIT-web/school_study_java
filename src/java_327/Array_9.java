public class Array_9 
{
	public static void main(String[] args) 
	{
		
		int[][] score = {{100, 100, 100, 50}
									,{20, 20, 20, 50}
									,{30, 30, 30, 50}
									,{40, 40, 40, 50}
									,{50, 50, 50, 50}};

		int koreanTotal = 0;
		int englishTotal = 0;
		int mathTotal = 0;
		int scienceTotal =0;

		System.out.println("\t��ȣ\t����\t����\t����\t����\t����\t���");
		System.out.println("============================================================");
	
		for (int i = 0; i< score.length ; i++) //���� ũ��
		{
			int sum = 0;
			koreanTotal += score[i][0];
			englishTotal += score[i][1];
			mathTotal += score[i][2];
			scienceTotal += score[i][3];
			

			System.out.print("\t" + (i + 1) + "\t "); // ��ȣ �̸��� ���� ���� ����. ���ڴ� ���ڳ��� ���ڴ� ���ڳ���... ��, arraylist�� ���� �ִ�.
			
			for (int j = 0; j < score[i].length ;j++ ) // i�� ���� ���� ũ��
			{
				sum += score[i][j];
				System.out.print(score[i][j] + "\t");
			}
			System.out.println(sum + "\t" + sum/(float)score[i].length);
		}		
		System.out.println("============================================================");
		System.out.println(" �� �� \t         " + koreanTotal + "\t" + englishTotal + "\t" + mathTotal + "\t" + scienceTotal);

		System.out.println();

	}
}
