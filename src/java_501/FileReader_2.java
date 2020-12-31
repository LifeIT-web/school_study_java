package java_501;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


//BufferedReader �� �д� ��

public class FileReader_2 {

	public static void main(String[] args) {
		try {
			// ���� ��ü ����
			File file = new File("../../java_325/Ex_1.java"); // ����� ����!!
			
			//�Է� ��Ʈ�� ����
			FileReader filereader = new FileReader(file);
			
			// �Է¹��� ����
			BufferedReader bufReader = new BufferedReader(filereader);
			String line = "";
			
			//���پ� �б�
			while ((line = bufReader.readLine()) != null) {
				System.out.println(line);
			}
			
			//.readLine()�� ���� ���� ���ڸ� ���� ����
			bufReader.close();
			
		} catch (FileNotFoundException e) {
		} catch(IOException e) {
			System.out.println(e);
		}
	}
}
