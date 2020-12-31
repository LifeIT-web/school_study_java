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

		System.out.println("\t번호\t국어\t영어\t수학\t과학\t총점\t평균");
		System.out.println("============================================================");
	
		for (int i = 0; i< score.length ; i++) //행의 크기
		{
			int sum = 0;
			koreanTotal += score[i][0];
			englishTotal += score[i][1];
			mathTotal += score[i][2];
			scienceTotal += score[i][3];
			

			System.out.print("\t" + (i + 1) + "\t "); // 번호 이름은 같이 쓸수 없다. 문자는 문자끼리 숫자는 숫자끼리... 단, arraylist로 쓸수 있다.
			
			for (int j = 0; j < score[i].length ;j++ ) // i행 안의 열의 크기
			{
				sum += score[i][j];
				System.out.print(score[i][j] + "\t");
			}
			System.out.println(sum + "\t" + sum/(float)score[i].length);
		}		
		System.out.println("============================================================");
		System.out.println(" 총 점 \t         " + koreanTotal + "\t" + englishTotal + "\t" + mathTotal + "\t" + scienceTotal);

		System.out.println();

	}
}
