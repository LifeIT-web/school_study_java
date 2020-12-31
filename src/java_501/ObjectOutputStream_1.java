package java_501;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

// 1바이트개념이기에 한글은 깨짐 그래서 영어로 왠만해선 대화

public class ObjectOutputStream_1 {

	public static void main(String[] args) throws IOException{
		
		Date date = new Date();
		String str = new String("아름다운 계절        즐거운 하루  \r\n");
		FileOutputStream fos = new FileOutputStream("C:\\kbs\\data_12.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeInt(500);
		oos.writeObject(str); // str 객체를 가져옴
		oos.writeObject(date); // date 객체를 가져옴
		System.out.println("FileOutputStream  실행");
		
		oos.flush();
		oos.close();
				
	}
}
