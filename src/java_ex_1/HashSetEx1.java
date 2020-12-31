package java_ex_1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx1 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Java");
		set.add("iBATIS");
				
		int size = set.size();
		
		System.out.println("ÃÑ °´Ã¼ ¼ö : " + size);
		
		Iterator<String> itt = set.iterator();
		while (itt.hasNext()) {
			String elm = itt.next();
			System.out.println("\t" + elm);
		}
		
		set.remove("Java");
		set.remove("iBATIS");
		
		System.out.println("ÃÑ °´Ã¼ ¼ö : " + set.size());
		
		itt = set.iterator();
		
		while (itt.hasNext()) {
			
			String elm = itt.next();
			System.out.println("\t" + elm);
		}
		
		set.clear();
		
		if (set.isEmpty()) {
			System.out.println("ºñ¾î ÀÖÀ½");
		}
		
		
	}
}
