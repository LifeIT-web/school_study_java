package java_504;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Date;

public class TimeClient {

	public static void main(String[] args) {
		
		String server_ip;
		Date date = null;
		int port = 7212;
		// 서버 포트 번호가 다르면 다시 연결하라고 뜸
		
		try {
		
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println(" 서버 타임 시간 받아오기 ...");
			// 서버를 켜있어야 돌아간다. (TimeServer 파일 실행 후 실행)
			
			System.out.print(" 서버 아이피 입력 : "); // IP주소 아무거나 
			server_ip = read.readLine();
			
			Socket client = new Socket(server_ip, port);
//							클라이언트는 그 서버의 ip와 port번호를 알고 있어야함
			
			InputStream is = client.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
			date = (Date) ois.readObject();
			
			System.out.println("현재 시간 : " + date);
			ois.close();
			client.close();
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
