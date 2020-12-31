// = import java.io.*;

public class DoWhile_2 
{
	public static void main(String[] args) throws java.io.IOException // = throws IOException (인풋I 아웃풋O)  < throws Exception(큰범위)
	{
		int input = 0;

		System.out.println("문장을 입력하시오 ");
		System.out.println("문장을 마치려면 0를 누르세요");

		do
		{
			input = System.in.read(); //버퍼에 들어갓다가 출력
			System.out.print((char)input);
		}
		while (input != '0');

		System.out.println("Lee jiyoon");
	}
}
// 즉 버퍼에 asddsadsadsads/*x*/dsadsadsa이 값이 들어갔다가 출력할때 x를 만나 종료가 됨