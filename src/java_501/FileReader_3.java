package java_501;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Scanner�� �д� ��

public class FileReader_3 {

	public static void main(String[] args) {
		
		try {
			//���� ��ü ����
			File file = new File("../../java_325/Ex_1.java");
			
			//��ĳ�ʷ� ���� �б�
			Scanner sc = new Scanner(file);
			
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
		}
	}
}
