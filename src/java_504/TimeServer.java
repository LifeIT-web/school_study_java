package java_504;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class TimeServer {

	public static void main(String[] args) {
		
		int port = 7212;
		// 1000번 이상 포트를 사용
		// 서버측 포트는 설정가능
		try {
			
			ServerSocket sos = new ServerSocket(port);
			
			while (true) { //  무한 루프가 돌고 있기에 연결되기를 계속 기다림
				Socket client = sos.accept();
				// 서버는 클라이언트가 연결하기를
				// 기다리고 있고, 연결이 되면
				// 새로운 Socket 객체를 생성하여 반환함
				OutputStream os = client.getOutputStream();
				//서버는  OutputStream 을 통하여 클라이언트에 정보를 보낸다.
				
				ObjectOutputStream oos = new ObjectOutputStream(os);
				
				oos.writeObject(new Date());
				//현재 시간 보내기
				oos.flush();
				oos.close();
				client.close();
				
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
// 프린트 되는거 없음.