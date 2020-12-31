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
		System.out.println("ÃÑ  Entry ¼ö : " + map.size());
		
		// °´Ã¼ Ã£±â
		System.out.println("\t È«±æµ¿ : " + map.get("Hong"));
		System.out.println();
		
		//°´Ã¼¸¦ ÇÏ³ª¾¿ Ã³¸®1
		Set<String> keySet = map.keySet();
		Iterator<String> kitt = keySet.iterator();
		while (kitt.hasNext()) {
			String key = kitt.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " +  value);
		}
		
		System.out.println();
		
		//°´Ã¼ »èÁ¦
		map.remove("Hong");
		System.out.println("ÃÑ Entry : " + map.size());
		
		// °´Ã¼¸¦ ÇÏ³ª¾¿ Ã³¸®2
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> eitt = entrySet.iterator();
		
		while (eitt.hasNext()) {
			Map.Entry<String, Integer> entry = eitt.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " +  value);
			
			
		}
		
		System.out.println();
		
		//°´Ã¼ ÀüÃ¼ »èÁ¦
		
		map.clear();
		System.out.println("ÃÑ Entry : " + map.size());
		
		
		
		
	}
}
