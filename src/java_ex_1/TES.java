package java_ex_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class TES {

	public static void main(String[] args) throws IOException {
		
		BufferedReader rb = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("웹사이트 이름 : ");
		String url = rb.readLine();
		
		InetAddress ia = InetAddress.getByName(url);
		
		System.out.println(ia.getHostAddress());
	}
}
