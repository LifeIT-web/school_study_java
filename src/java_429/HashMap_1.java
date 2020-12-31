package java_429;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_1 {

	public static void main(String[] args) {
		
//		HashMap<Integer, String> map = new HashMap<>();
		HashMap<String, String> map = new HashMap<>();
		
//		map.put(1234, "korea"); //  1234 를 String 해도 됨
//			// Key, Value
//		map.put(1111, "asdf"); // Key는 중복 허용 x
//		map.put(4567, "asdf");
//		map.put(7890, "seoul"); // Value는 중복 허용 o
	
		map.put("korea", "1234"); 
		map.put("asdf", "1111");  // Key 중복 나오면 마지막 값으로 대체됨
		map.put("asdf", "1234");
		map.put("seoul", "6789");
		
		Scanner ss = new Scanner(System.in);
		
		while (true) {
			System.out.println("id와 password를 입력해주세요!");
			System.out.print("id : ");
//			int id = ss.nextInt();
			String id = ss.next().trim();
			if (!map.containsKey(id)) { // key
				System.out.println("입력하신 " + id + " 는 존재하지 않습니다.");
				continue;
			}
			else { // value
				System.out.print("password : ");
				String password = ss.next().trim(); // 공백제거
//				int password = ss.nextInt();
				System.out.println();
				if (!(map.get(id).equals(password))) {
					System.out.println(map.get(id));
					System.out.println("비밀번호가 일치하지 않습니다.");
				}else {
					System.out.println("로그인 됬다네");
					break;
				}
			}
		}
	}
}
