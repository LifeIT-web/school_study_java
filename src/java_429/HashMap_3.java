package java_429;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_3 {

	static HashMap phoneBook = new HashMap();
	
	public static void main(String[] args) {
		
		addPhoneNO("친구", "수선화", "010-456-7890");
		addPhoneNO("친구", "해당화", "010-889-5654");
		addPhoneNO("친구", "해당화", "010-376-8845");
		addPhoneNO("친구", "들국화", "010-924-1255");
		addPhoneNO("회사", "영산강", "010-563-2538");
		addPhoneNO("회사", "섬진강", "010-764-5841");
		addPhoneNO("회사", "금강", "010-543-8977");
		addPhoneNO("회사", "한강", "010-283-6653");
		addPhoneNO("목욕탕", "010-852-4566");
		addPhoneNO("목욕탕", "010-852-4556");
		addPhoneNO("목욕탕", "010-852-4546");
		addPhoneNO("세탁", "010-833-4444");
		
		printList();
		
	}
	
//	전화번호부 전체를 출력
	private static void printList() {
		
		Set set = phoneBook.entrySet();
		Iterator itt = set.iterator();
		
		while (itt.hasNext()) {
			
			Map.Entry e = (Entry) itt.next();
			
			Set subSet = ((HashMap) e.getValue()).entrySet();
			Iterator subIt = subSet.iterator();
			
			System.out.println(" * " + e.getKey() + "[" 
								+ subSet.size() + "]"); // 크기값
			
			while (subIt.hasNext()) {
				Map.Entry subE = (Entry) subIt.next();
				
				String telNo = (String)subE.getKey();
				String name = (String)subE.getValue();
				// 이름 전화번호가 여기서 출력
				System.out.println(name + " " + telNo);
			}
			System.out.println();
		}
	}
	
	private static void addPhoneNO(String name, String tel) {
		addPhoneNO("기타", name, tel);
	}

	private static void addPhoneNO(String groupName ,String name, String tel) {
		
		addGroup(groupName);
		
		HashMap group = (HashMap) phoneBook.get(groupName);
										//그룹명을 가져다
		group.put(tel, name);
		//여기다 넣어라
		
	}
	
	private static void addGroup(String groupName) {
		if (!phoneBook.containsKey(groupName)) {
			phoneBook.put(groupName, new HashMap());
		}
	}
}
