package java_501;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
// test�� �� ����� ������ ����
// �ѱ۷� �ϸ� ȭ���� �����ϱ�
public class BufferedOutputStream_1 {

	public static void main(String[] args) throws IOException {
		
		String file, str;
		
		Date date = new Date();
		
		str = " ���� ���� �ð� ������ \r\n" + date + "\n";
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("���� �̸� : ");
		file = read.readLine();

		System.out.print("������ ���ڿ� : ");
		str += read.readLine();
		
		byte[] byte_str = str.getBytes();
		
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		bos.write(byte_str);
		bos.close();
		
		System.out.println(file + " �� ���������� ���� �Ͽ���");
		
	}
}
