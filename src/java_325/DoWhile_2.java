// = import java.io.*;

public class DoWhile_2 
{
	public static void main(String[] args) throws java.io.IOException // = throws IOException (��ǲI �ƿ�ǲO)  < throws Exception(ū����)
	{
		int input = 0;

		System.out.println("������ �Է��Ͻÿ� ");
		System.out.println("������ ��ġ���� 0�� ��������");

		do
		{
			input = System.in.read(); //���ۿ� ���ٰ� ���
			System.out.print((char)input);
		}
		while (input != '0');

		System.out.println("Lee jiyoon");
	}
}
// �� ���ۿ� asddsadsadsads/*x*/dsadsadsa�� ���� ���ٰ� ����Ҷ� x�� ���� ���ᰡ ��