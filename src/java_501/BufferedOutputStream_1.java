package java_501;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
// test할 땐 영어로 무조건 실행
// 한글로 하면 화면이 깨지니까
public class BufferedOutputStream_1 {

	public static void main(String[] args) throws IOException {
		
		String file, str;
		
		Date date = new Date();
		
		str = " 파일 생성 시간 이지윤 \r\n" + date + "\n";
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("파일 이름 : ");
		file = read.readLine();

		System.out.print("저장할 문자열 : ");
		str += read.readLine();
		
		byte[] byte_str = str.getBytes();
		
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		bos.write(byte_str);
		bos.close();
		
		System.out.println(file + " 에 성공적으로 저장 하였음");
		
	}
}
