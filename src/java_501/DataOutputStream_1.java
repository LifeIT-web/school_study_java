package java_501;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
// 데이터들을 파일 저장
public class DataOutputStream_1 {

	public static void main(String[] args) throws IOException {
		
		File tFile = new File("C:\\kbs\\data_11.txt");
		FileOutputStream fos = new FileOutputStream(tFile);
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeBoolean(true);
		dos.writeChar(99);
		dos.writeByte(7);
		dos.writeShort(100);
		dos.writeInt(100);;
		dos.writeLong(1000);
		dos.writeFloat(89.345f);
		dos.writeDouble(4567.4322); 
		dos.flush();
		// 엔터키, 개행 다 데이터가 들어 감 그래서 30바이트가 나오는 이유는 안보이는 글자들도 포함하면 실행된 것이다. 
		// 버퍼에 남은 출력 스트림 출력
		// flush() 메소드를 호출하지 않으면
		// 버퍼로만 출력이 되기 때문에 실제로 도착지점에는
		// 아무런 데이터를 받지 못하는 경우가 발생할 수 있음
		
		System.out.println("data_11.txt 에 " + dos.size() + " byte 저장");
		
		dos.close();
	}
}
