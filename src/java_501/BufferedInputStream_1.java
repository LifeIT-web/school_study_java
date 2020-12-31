package java_501;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class BufferedInputStream_1 {

	public static void main(String[] args) throws Exception{
		
		int i = 0;
		
		String file;
		
		BufferedReader read = new BufferedReader
								(new InputStreamReader(System.in));
		
		System.out.print("읽어올 파일 이름 : ");
		file = read.readLine();
		
		System.out.println(file + " 문서 내용");
		
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		// 안써도 되지만 효과를 더 좋게 쓸수 있게
		while ((i = bis.read()) != -1) {
			System.out.print((char) i);
		}
		bis.close();
	}
}
//한글은 1바이트 글자가 아니기 때문에 깨져서 나온다.

// 깨져서 나오는 글자들은 다 아스키 코드값 