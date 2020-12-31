package java_504;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;

// 여러 IP 뽑는법
// IP개수가 상시 다 다르다.

public class InetAddress_3 {

	public static void main(String[] args) throws Exception {
		
		String url = null;
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("웹사이트 이름을 입력하시오");
		url = read.readLine();
		
		InetAddress[] addr = InetAddress.getAllByName(url);
										// 여러 IP읽어올땐 배열로 쓴다.
		
		System.out.println("===============================");
		
		System.out.println(url + " 는 " + addr.length + " 개의 IP 주소를 갖고");
		
		for (int i = 0; i < addr.length; i++) {
			System.out.println(( i + 1 ) + " 번 IP 번호 : " + addr[i].getHostAddress());
		}
		
	}
}
