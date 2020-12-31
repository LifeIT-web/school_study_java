package java_501;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

// 파일 안에 있는 데이터를 읽음

public class DataInputStream_1 {

	public static void main(String[] args) throws IOException{
		
		File tFile = new File("C:\\kbs\\data_11.txt");
		
		if (!tFile.exists()) {
			System.out.println("파일이 존재하지 않슴");
			System.exit(1);
		}
		
		FileInputStream fis = new FileInputStream(tFile);
		DataInputStream dis = new DataInputStream(fis);
		
		System.out.println(dis.readBoolean());
		System.out.println(dis.readChar());
		System.out.println(dis.readByte());
		System.out.println(dis.readShort());
		System.out.println(dis.readInt());
		System.out.println(dis.readLong());
		System.out.println(dis.readFloat());
		System.out.println(dis.readDouble());
		// 엔터키 개행 데이터는 보여달라고 선언 안했기에 안보임
		
		dis.close();
	}
}

// Window폴더 건드리는 것 아님
// 파일을 만들거면 이렇게 만들면 됨