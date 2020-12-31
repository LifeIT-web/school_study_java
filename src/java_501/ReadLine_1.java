package java_501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadLine_1 {

	public static void main(String[] args) throws IOException{
		
		String name = null;
		String addr = null;
		String number = null;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader 클래스의 객체 reader 를 생성함
		// System.in.read()는 한문자씩 바이트로 입력받기 때문에
		// 문자열로 변형해야 함
		// InputStreamReader 클래스는 바이트 단위 입력 스트림을 문자 단위
		// 입력 스트림으로 변형함
		// 문자열을 효율적으로 처리하기 위해 BufferedReader 클래스의 객체를
		// 이용하면 사용자가 입력한 문자열을 쉽게 입력 받을 수 있음
		// 문자열을 입력 받기 위해 BufferedReader 클래스를 사용함
		
		System.out.print("이름을 입력 하시오 !");

		name = reader.readLine();// 입력 값과 엔터키 값까지 받아드림
		
		System.out.print("주소을 입력 하시오 !");
		
		addr = reader.readLine();
		
		System.out.print("전화번호을 입력 하시오 !");
		
		number = reader.readLine();
		
		System.out.println(name + " 님 반갑슴다. 당신은 " + addr + "에 살고 잇고, 전화번호는 " + number + " 이군요");
		
	}	
}
