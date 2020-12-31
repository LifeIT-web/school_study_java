package java_501;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Scanner로 읽는 법

public class FileReader_3 {

	public static void main(String[] args) {
		
		try {
			//파일 객체 생성
			File file = new File("../../java_325/Ex_1.java");
			
			//스캐너로 파일 읽기
			Scanner sc = new Scanner(file);
			
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
		}
	}
}
