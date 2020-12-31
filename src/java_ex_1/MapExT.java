package java_ex_1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import javax.xml.crypto.dsig.keyinfo.KeyInfoFactory;

public class MapExT {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("Sin", 85);
		map.put("Hong", 45);
		map.put("Dong", 85);
		map.put("Hong", 36);
		System.out.println("��  Entry �� : " + map.size());
		
		// ��ü ã��
		System.out.println("\t ȫ�浿 : " + map.get("Hong"));
		System.out.println();
		
		//��ü�� �ϳ��� ó��1
		Set<String> keySet = map.keySet();
		Iterator<String> kitt = keySet.iterator();
		while (kitt.hasNext()) {
			String key = kitt.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " +  value);
		}
		
		System.out.println();
		
		//��ü ����
		map.remove("Hong");
		System.out.println("�� Entry : " + map.size());
		
		// ��ü�� �ϳ��� ó��2
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> eitt = entrySet.iterator();
		
		while (eitt.hasNext()) {
			Map.Entry<String, Integer> entry = eitt.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " +  value);
			
			
		}
		
		System.out.println();
		
		//��ü ��ü ����
		
		map.clear();
		System.out.println("�� Entry : " + map.size());
		
		
		
		
	}
}
