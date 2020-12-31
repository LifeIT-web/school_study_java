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
		// ���� ��Ʈ ��ȣ�� �ٸ��� �ٽ� �����϶�� ��
		
		try {
		
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println(" ���� Ÿ�� �ð� �޾ƿ��� ...");
			// ������ ���־�� ���ư���. (TimeServer ���� ���� �� ����)
			
			System.out.print(" ���� ������ �Է� : "); // IP�ּ� �ƹ��ų� 
			server_ip = read.readLine();
			
			Socket client = new Socket(server_ip, port);
//							Ŭ���̾�Ʈ�� �� ������ ip�� port��ȣ�� �˰� �־����
			
			InputStream is = client.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
			date = (Date) ois.readObject();
			
			System.out.println("���� �ð� : " + date);
			ois.close();
			client.close();
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
