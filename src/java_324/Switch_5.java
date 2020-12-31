import java.io.*;

public class Switch_5 
{
	public static void main(String[] args)  throws Exception
	{
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int score = 0;
		char grade = ' ';

		System.out.print("점수 입력 : ");
		score = Integer.parseInt(in.readLine());

		switch (score / 10)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
		{                                        
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default : 
			grade = 'F';
			break;
		}
		System.out.println("당신의 학점은 " + grade + " 입니다. ");
		System.out.println("Lee jiyoon");
	}
}

mrhi
전화번호 / 생년월일
00000000