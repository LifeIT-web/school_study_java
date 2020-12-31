package java_504;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;

// ���� IP �̴¹�
// IP������ ��� �� �ٸ���.

public class InetAddress_3 {

	public static void main(String[] args) throws Exception {
		
		String url = null;
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("������Ʈ �̸��� �Է��Ͻÿ�");
		url = read.readLine();
		
		InetAddress[] addr = InetAddress.getAllByName(url);
										// ���� IP�о�ö� �迭�� ����.
		
		System.out.println("===============================");
		
		System.out.println(url + " �� " + addr.length + " ���� IP �ּҸ� ����");
		
		for (int i = 0; i < addr.length; i++) {
			System.out.println(( i + 1 ) + " �� IP ��ȣ : " + addr[i].getHostAddress());
		}
		
	}
}
