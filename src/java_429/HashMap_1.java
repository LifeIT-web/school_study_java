package java_429;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_1 {

	public static void main(String[] args) {
		
//		HashMap<Integer, String> map = new HashMap<>();
		HashMap<String, String> map = new HashMap<>();
		
//		map.put(1234, "korea"); //  1234 �� String �ص� ��
//			// Key, Value
//		map.put(1111, "asdf"); // Key�� �ߺ� ��� x
//		map.put(4567, "asdf");
//		map.put(7890, "seoul"); // Value�� �ߺ� ��� o
	
		map.put("korea", "1234"); 
		map.put("asdf", "1111");  // Key �ߺ� ������ ������ ������ ��ü��
		map.put("asdf", "1234");
		map.put("seoul", "6789");
		
		Scanner ss = new Scanner(System.in);
		
		while (true) {
			System.out.println("id�� password�� �Է����ּ���!");
			System.out.print("id : ");
//			int id = ss.nextInt();
			String id = ss.next().trim();
			if (!map.containsKey(id)) { // key
				System.out.println("�Է��Ͻ� " + id + " �� �������� �ʽ��ϴ�.");
				continue;
			}
			else { // value
				System.out.print("password : ");
				String password = ss.next().trim(); // ��������
//				int password = ss.nextInt();
				System.out.println();
				if (!(map.get(id).equals(password))) {
					System.out.println(map.get(id));
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}else {
					System.out.println("�α��� ��ٳ�");
					break;
				}
			}
		}
	}
}
