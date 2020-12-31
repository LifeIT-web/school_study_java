package java_501;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Date;

public class ObjectInputStream_1 {

	public static void main(String[] args) throws Exception{
		
		String str, date_str;
		Date date;
		
		FileInputStream fis = new FileInputStream("C:\\kbs\\data_12.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		System.out.print(ois.readInt());
		
		str = (String) ois.readObject();
		
		System.out.print("\n" + str);
		
		date = (Date) ois.readObject();
		
		date_str = (date.getYear() + 1900) + " �� ";
		date_str += (date.getMonth() + 1) + " �� ";
		date_str += (date.getDate()) + " �� ";
		
		System.out.print(date_str);
		System.out.println();
		
		ois.close();
		
	}
}
