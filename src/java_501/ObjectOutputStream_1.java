package java_501;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

// 1����Ʈ�����̱⿡ �ѱ��� ���� �׷��� ����� �ظ��ؼ� ��ȭ

public class ObjectOutputStream_1 {

	public static void main(String[] args) throws IOException{
		
		Date date = new Date();
		String str = new String("�Ƹ��ٿ� ����        ��ſ� �Ϸ�  \r\n");
		FileOutputStream fos = new FileOutputStream("C:\\kbs\\data_12.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeInt(500);
		oos.writeObject(str); // str ��ü�� ������
		oos.writeObject(date); // date ��ü�� ������
		System.out.println("FileOutputStream  ����");
		
		oos.flush();
		oos.close();
				
	}
}
