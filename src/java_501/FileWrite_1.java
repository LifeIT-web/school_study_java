package java_501;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Date;
// ���� �����
public class FileWrite_1 {

	public static void main(String[] args) throws Exception{
		
		String file, str;
		
		Date date = new Date();
		
		str = "File Write Time ������ \n " + date + "\n";
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("���� �̸� �Է� : ");
		file = read.readLine();

		System.out.print("������ ���ڿ��� �Է� : ");
		str += read.readLine();
		
		char[] ch_str = new char[str.length()];
		
		str.getChars(0, str.length(), ch_str, 0);
				// 0 ������ str���̱���, ch_str�� 0������ ���� �ְڴ�.
		FileWriter fww = new FileWriter(file);
		
		fww.write(ch_str);
		fww.close();
		
		System.out.println(file + " ������ ���������� ���� �Ͽ���");
	}
}
