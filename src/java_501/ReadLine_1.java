package java_501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadLine_1 {

	public static void main(String[] args) throws IOException{
		
		String name = null;
		String addr = null;
		String number = null;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader Ŭ������ ��ü reader �� ������
		// System.in.read()�� �ѹ��ھ� ����Ʈ�� �Է¹ޱ� ������
		// ���ڿ��� �����ؾ� ��
		// InputStreamReader Ŭ������ ����Ʈ ���� �Է� ��Ʈ���� ���� ����
		// �Է� ��Ʈ������ ������
		// ���ڿ��� ȿ�������� ó���ϱ� ���� BufferedReader Ŭ������ ��ü��
		// �̿��ϸ� ����ڰ� �Է��� ���ڿ��� ���� �Է� ���� �� ����
		// ���ڿ��� �Է� �ޱ� ���� BufferedReader Ŭ������ �����
		
		System.out.print("�̸��� �Է� �Ͻÿ� !");

		name = reader.readLine();// �Է� ���� ����Ű ������ �޾Ƶ帲
		
		System.out.print("�ּ��� �Է� �Ͻÿ� !");
		
		addr = reader.readLine();
		
		System.out.print("��ȭ��ȣ�� �Է� �Ͻÿ� !");
		
		number = reader.readLine();
		
		System.out.println(name + " �� �ݰ�����. ����� " + addr + "�� ��� �հ�, ��ȭ��ȣ�� " + number + " �̱���");
		
	}	
}
