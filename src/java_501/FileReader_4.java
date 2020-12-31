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
		
		//파일 객체 생성
		Path path = Paths.get("../../java_325/Ex_1.java");
		
		//캐릭터셋 지정
		Charset cs = StandardCharsets.ISO_8859_1;
		 							// 기본임 근데 다른걸로 바꾸면 에러가 뜬다
		// 약간 화면이 깨진다.
		
		// 파일 내용담을 리스트
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
