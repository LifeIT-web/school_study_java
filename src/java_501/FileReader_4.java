package java_501;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReader_4 {

	public static void main(String[] args) {
		
		//���� ��ü ����
		Path path = Paths.get("../../java_325/Ex_1.java");
		
		//ĳ���ͼ� ����
		Charset cs = StandardCharsets.ISO_8859_1;
		 							// �⺻�� �ٵ� �ٸ��ɷ� �ٲٸ� ������ ���
		// �ణ ȭ���� ������.
		
		// ���� ������� ����Ʈ
		List<String> list = new ArrayList<String>();
		
		try {
			list = Files.readAllLines(path, cs);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		for (String readLine : list) {
			System.out.println(readLine);
		}
	}
}
